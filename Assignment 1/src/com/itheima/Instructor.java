package com.itheima;

import java.util.Scanner;

public class Instructor extends Person{
    private int Instructorid;
    private Course teachinghead;

    public Instructor(){
        new Person();
    }
    public Instructor(String name,int age,String email,int Instructorid){
        this.setAge(age);
        this.setName(name);
        this.setEmail(email);
        this.Instructorid=Instructorid;
    }
    public void setInstructorid(int Instructorid){
        this.Instructorid=Instructorid;
    }
    public int getInstructorid(){
        return Instructorid;
    }
    public Course getCoursehead(){
        return teachinghead;
    }
    public void setTeaching(){
        System.out.println("The Instructor name is "+this.getName());
        System.out.println("Do you want to enter a course? Enter the int: 1.yes 2. no");
        int a;
        String course;
        Course p1=null;
        Course p2=null;
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
    public void printTeaching(){
        System.out.println("The Instructor name is "+this.getName());
        for(Course i=teachinghead;i!=null;i=i.getNext()){
            System.out.println(i.getCourse());
        }
    }
}
