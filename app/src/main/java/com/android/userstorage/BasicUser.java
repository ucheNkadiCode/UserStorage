package com.android.userstorage;

/**
 * Created by SYSTEM on 9/4/2018.
 */

public class BasicUser {
    private String firstName;
    private String lastName;
    private String email;

    public BasicUser(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String setEmail(String newEmail){
        this.email = newEmail;
        return newEmail;
    }
    
    public String setFirstName(String newFirstName){
        this.firstName = newFirstName;
        return newFirstName;
    }
    
    public String setLastName(String newLastName){
        this.lastName = newLastName;
        return newLastName;
    }
}
