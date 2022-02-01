package com.itheima;
import java.io.FileOutputStream;
import java.io.IOException;

public class Course {
    private String course;
    private char score=' ';//only for student;
    private Course next=null;//point to the next course;

    public Course(){
        course=new String();
    }
    public Course(String course,char score){
        this.course=course;
        this.score=score;
    }
    public Course getNext() {
        return next;
    }
    public char getScore() {
        return score;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setNext(Course next) {
        this.next = next;
    }
    public void setScore(char score) {
        this.score = score;
    }
    public void File_Out(FileOutputStream out) throws IOException {
      byte[] Course_name=course.getBytes();
      int Score=score;
      byte[] Word;
      Word="{\n".getBytes();
      out.write(Word);

      Word="\"Couse\": \"".getBytes();
      out.write(Word);
      out.write(Course_name);

      if(score!=' ') {
        Word = "\",\n\"Score\": \"".getBytes();
        out.write(Word);
        out.write(Score);
      }

      Word="\",\n},\n".getBytes();
      out.write(Word);
    }
}
