package com.android.userstorage;

/**
 * Created by SYSTEM on 9/4/2018.
 */

public class BasicUser {
    private String firstName;
    private String lastName;

    public BasicUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
