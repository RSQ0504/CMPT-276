package com.itheima;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public abstract class Person {
    //the method of all functions in this class is similar with Instructor class.
    private String name;
    private String email;
    private Person nextPerson;//point to the next person;

    public Person(){
        name=new String();
        email=new String();
    }
    public Person(String name,String email){
        this.name = name;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setNextPerson(Person nextPerson){
        this.nextPerson=nextPerson;
    }
    public Person getNextPerson(){return nextPerson;}
    //virtual function;
    public void printinformation(){
        System.out.println("---------------------------------------------------");
        System.out.println("The Person name is "+this.getName());
        System.out.println("E-mail is: "+this.getEmail());
        System.out.println("---------------------------------------------------");
    }
    public void setinformation(){
        System.out.println("The person's name is "+this.getName());
        System.out.println("No course is needed to be entered");
    }
    public String get_id(){
        return "N/A";
    }
    public void set_id(String id){
        System.out.println("ID is not needed for Person");
    }
    public Course getCoursehead() {
        System.out.println("The person is not allowed to add course.");
        return null;
    }
    public void File_Out(FileOutputStream out) throws IOException {
        byte[] Name;
        byte[] Email;
        byte[] Word;
        Name = name.getBytes();
        Email = email.getBytes();
        Word="----------------------------------------".getBytes();
        out.write(Word);
        Word="\n".getBytes();
        out.write(Word);

        Word="This is a person:".getBytes();
        out.write(Word);
        Word="\n".getBytes();
        out.write(Word);

        Word="Name: ".getBytes();
        out.write(Word);
        out.write(Name);
        Word="\n".getBytes();
        out.write(Word);

        Word="email: ".getBytes();
        out.write(Word);
        out.write(Email);
        Word="\n".getBytes();
        out.write(Word);

        Word="----------------------------------------".getBytes();
        out.write(Word);
        Word="\n".getBytes();
        out.write(Word);
    }
}
