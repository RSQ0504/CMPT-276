package com.itheima;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    public static  void main(String[] arge) throws IOException {
        File information = new File("/Users/qianrongsheng/Desktop/CMPT 276-D100/276assignments/Assignment 1/Information.json");
        information.createNewFile();
        FileOutputStream out = new FileOutputStream(information);
        Person head = null,p1=null,p2=null;
        int check;
        String name,id,email;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enter a person.         1. Yes    2.NO");
        check = sc.nextInt();
        while(check==1){
            System.out.println("1. Student    2.Instructor");
            check =sc.nextInt();
            System.out.println("Enter name");
            name =sc.next();
            System.out.println("Enter ID");
            id = sc.next();
            System.out.println("Enter Email");
            email=sc.next();
            switch(check){
                case 1:
                    if(head==null){
                    head = new Student(name,email,id);
                    head.setinformation();
                    head.File_Out(out);
                    p1=head;
                }else{
                        p2=new Student(name,email,id);
                        p2.setinformation();
                        p2.File_Out(out);
                        p1.setNextPerson(p2);
                        p1=p2;
                    }
                    break;
             case 2:
                 if(head==null){
                     head = new Instructor(name,email,id);
                     head.setinformation();
                     head.File_Out(out);
                     p1=head;
                 }else{
                     p2=new Instructor(name,email,id);
                     p2.setinformation();
                     p2.File_Out(out);
                     p1.setNextPerson(p2);
                     p1=p2;
                 }
                 break;
             default:
                 break;
            }
            System.out.println("Do you want to enter a person.         1. Yes    2.NO");
            check = sc.nextInt();
        }
        out.close();
        p1=head;
        while(p1!=null){
            p1.printinformation();
            p1=p1.getNextPerson();
        }
    }
}
