package com.maze;

public class Wall extends Mapsite{
  Wall() {
    wallNr = wallCnt++;
    System.out.println("creating Wall #" + new Integer(wallNr).toString());
  }
  public String toString() {
  return "Wall #" + new Integer(wallNr).toString();
  }
  private int wallNr;
  private static int wallCnt = 1;

}
