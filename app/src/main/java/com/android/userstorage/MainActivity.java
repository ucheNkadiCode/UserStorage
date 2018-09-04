package com.android.userstorage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText firstName;
    private EditText lastName;
    private Button registerButton;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseApp.initializeApp(this);
        mDatabase = FirebaseDatabase.getInstance().getReference("Users");
        firstName= (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(this);
    }

    private void userRegister() {
        String first =  firstName.getText().toString().trim();
        String last =  lastName.getText().toString().trim();
        if (TextUtils.isEmpty(first)) {
            // E-mail is empty
            Toast.makeText(this, "Please enter your First Name", Toast.LENGTH_LONG).show();

            // Stop the function from executing further
            return;
        }
        if (TextUtils.isEmpty(last)) {
            // E-mail is empty
            Toast.makeText(this, "Please enter your Last Name", Toast.LENGTH_LONG).show();

            // Stop the function from executing further
            return;
        }
        BasicUser newPetition = new BasicUser(first, last);
        mDatabase.child("Users").setValue(newPetition);
        Toast.makeText(this, "Your name has been added to the petition", Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, MainActivity.class));

    }
    @Override
    public void onClick(View v) {
        if (v == registerButton) {
            userRegister();
        }
    }
}
