package com.maze;

public class Wall extends Mapsite{
  Wall() {
    wallNr = wallCnt++;
    System.out.println("creating Wall #" + wallNr);
  }
  public String toString() {
  return "Wall #" + wallNr;
  }
  private int wallNr;
  private static int wallCnt = 1;

  public boolean enter(){
    //System.out.println(this.toString() +" Cannot be entered!");
    return false;
  }
}
