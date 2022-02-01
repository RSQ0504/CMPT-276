package com.itheima;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Student extends Person{
    //the method used in all functions in this class is similar with the method in Instructor class;
    private String studentid;
    private Course coursehead=null;

    public Student(){
        return;
    }
    public Student(String name,String email,String studentid){
        this.setName(name);
        this.setEmail(email);
        this.studentid=studentid;
    }
    public void set_id(String studentid){
        this.studentid=studentid;
    }
    public String get_id(){
        return studentid;
    }
    public Course getCoursehead(){
        return coursehead;
    }
    public void setinformation(){
        System.out.println("The student name is "+this.getName());
        System.out.println("Do you want to enter a score of a course? Enter the int: 1.yes 2. no");
        int a;
        String course;
        char score;
        Course p1=null;
        Course p2=null;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while(a==1){
            System.out.println("Enter the name of the course");
            course=sc.next();
            System.out.println("Enter the score of the course");
            score=sc.next().charAt(0);
            if(coursehead==null){
                coursehead=new Course(course,score);
                p2=coursehead;
            }else{
                p1=new Course(course,score);
                p2.setNext(p1);;
                p2=p1;
            }
            System.out.println("Do you want to continue to enter a score of a course? 1.yes 2. no");
            a = sc.nextInt();
        }
        return;
    }
    public void printinformation(){
        System.out.println("---------------------------------------------------");
        System.out.println("The student name is "+this.getName());
        System.out.println("E-mail is: "+this.getEmail());
        System.out.println("ID is: "+this.get_id());
        System.out.println("Score:");
        for(Course i=coursehead;i!=null;i=i.getNext()){
            System.out.println("     "+i.getCourse()+"    "+i.getScore());
        }
        System.out.println("---------------------------------------------------");
    }
    public void File_Out(FileOutputStream out) throws IOException {
        byte[] Name = getName().getBytes();
        byte[] Email = getEmail().getBytes();
        byte[] Word;
        byte[] ID = get_id().getBytes();
        Word="{\n\"Person\": \"This is a Student\",\n".getBytes();
        out.write(Word);

        Word="\"Name\": \"".getBytes();
        out.write(Word);
        out.write(Name);
        Word="\",\n".getBytes();
        out.write(Word);

        Word="\"email\": \"".getBytes();
        out.write(Word);
        out.write(Email);
        Word="\",\n".getBytes();
        out.write(Word);

        Word="\"ID\": \"".getBytes();
        out.write(Word);
        out.write(ID);
        Word="\",\n".getBytes();
        out.write(Word);

      Word="\"Score is\": [\n".getBytes();
      out.write(Word);

        Course p=coursehead;
        while(p!=null){
            p.File_Out(out);
            p=p.getNext();
        }

        Word="],\n},\n".getBytes();
        out.write(Word);
    }
}
