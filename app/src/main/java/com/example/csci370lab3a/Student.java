package com.example.csci370lab3a;

public class Student {
    private String firstName;
    private String lastName;
    private String major;

    public Student(String firstName, String lastName, String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return this.major;
    }

}
