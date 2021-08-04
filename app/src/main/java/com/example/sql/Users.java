package com.example.sql;

import java.io.Serializable;

public class Users implements Serializable {
    private String name;
    private String contact;
    private String dateofbirth;

    public Users(String name, String contact, String dateofbirth) {
        this.name = name;
        this.contact = contact;
        this.dateofbirth = dateofbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String toString() {
        return "Users " +
                ", name='" + name + '\n' +
                ", contact='" + contact + '\n' +
                ", date of birth=" + dateofbirth + '\n'+
                '}';
    }
}
