package com.itheima;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Instructor extends Person{
    private String Instructorid;
    private Course teachinghead;//a pointer of a course this teacher is teaching;

    public Instructor(){
        return;
    }
    public Instructor(String name,String email,String Instructorid){
        this.setName(name);
        this.setEmail(email);
        this.Instructorid=Instructorid;
    }
    public void set_id(String Instructorid){
        this.Instructorid=Instructorid;
    }
    public String get_id(){
        return Instructorid;
    }
    public Course getCoursehead(){
        return teachinghead;
    }
    public void setinformation(){
        System.out.println("The Instructor name is "+this.getName());
        System.out.println("Do you want to enter a course? Enter the int: 1.yes 2. no");
        int a;
        String course;
        Course p1=null;//store last address
        Course p2=null;//new a new memory;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while(a==1){
            System.out.println("Enter the name of the course");
            course=sc.next();
            if(teachinghead==null){
                teachinghead=new Course(course,' ');
                p2=teachinghead;
            }else{
                p1=new Course(course,' ');
                p2.setNext(p1);;
                p2=p1;
            }
            System.out.println("Do you want to continue to enter a course? 1.yes 2. no");
            a = sc.nextInt();
        }
        return;
    }
    public void printinformation(){
        System.out.println("---------------------------------------------------");
        System.out.println("The Instructor name is "+this.getName());
        System.out.println("E-mail is: "+this.getEmail());
        System.out.println("ID is: "+this.get_id());
        System.out.println("Course:");
        for(Course i=teachinghead;i!=null;i=i.getNext()){
            System.out.println("     "+i.getCourse());
        }
        System.out.println("---------------------------------------------------");
    }
    public void File_Out(FileOutputStream out) throws IOException {
        byte[] Name = getName().getBytes();;
        byte[] Email= getEmail().getBytes();
        byte[] Word;
        byte[] ID= get_id().getBytes();
        Word=" {\n  \"Person\": \"This is an Instructor\",\n".getBytes();
        out.write(Word);

        Word="  \"Name\": \"".getBytes();
        out.write(Word);
        out.write(Name);
        Word="\",\n".getBytes();
        out.write(Word);

        Word="  \"email\": \"".getBytes();
        out.write(Word);
        out.write(Email);
        Word="\",\n".getBytes();
        out.write(Word);

        Word="  \"ID\": \"".getBytes();
        out.write(Word);
        out.write(ID);
        Word="\",\n".getBytes();
        out.write(Word);

        Word="  \"Course which is teaching is\": [\n".getBytes();
        out.write(Word);

        Course p=teachinghead;
        //out the information of the Course this teacher is teaching;
        while(p!=null){
            p.File_Out(out);
            p=p.getNext();
        }

        Word="  ],\n },\n".getBytes();
        out.write(Word);
    }
}
