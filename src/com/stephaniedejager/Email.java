package com.stephaniedejager;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String companySuffix = "thecompany.com";
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;

    //Constructor receives the first name and last name
    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        //System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);

        //Call a method asking for department - return the department
        department = setDepartment();
        //System.out.println("DEPARTMENT: " + department);

        //Call a method that returns a random password
        password = randomPassword(defaultPasswordLength);
        //System.out.println("PASSWORD: " + password);

        //Combine elements to generate email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department  + "." + companySuffix;
        //System.out.println("EMAIL ADDRESS: " + email);

    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("New worker: " + firstname + " Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice == 1){
            return "sales";
        } else if(depChoice == 2){
            return "dev";
        }else  if(depChoice == 3){
            return "acct";
        }else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRST!@#$%";
        char[] password = new char[length];
        for(int i =0; i<length; i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] =passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //Set alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    //Set password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME:" + firstname + " " + lastname + "\n" +
                "COMPANY EMAIL: " + email +  "\n" +
                "PASSWORD: " + password + "\n" +
                "MAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}
