package com.itheima;

public class Main {
    public static  void main(String[] arge){
        Student student1 = new Student("David",20,"David@sfu.ca","0111");
        student1.setScore();
        student1.printScore();
        Instructor instructor1=new Instructor("David",40,"David@sfu.ca","0001");
        instructor1.setTeaching();
        instructor1.printTeaching();
    }
}
