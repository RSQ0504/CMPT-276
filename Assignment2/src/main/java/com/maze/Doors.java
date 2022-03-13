package com.maze;

public class Doors extends Mapsite{
  Doors(Room r1, Room r2) {
    doorNr = doorCnt++;
    System.out.println("creating a " + toString() + " between " + r1 + " and " + r2);
    room1 = r1;
    room2 = r2;
  }
  public String toString() {
  return "Door #" + doorNr;
  }

  public Room otherSideFrom(Room r){
    if(r==room1)
      return room2;
    else if(r==room2)
      return room1;
    else {
      System.out.println("Wrong input");
      return null;
    }
  }

  public boolean enter(){
    //System.out.println(this.toString() +" can enter "+ room1.toString()+" "+room2.toString());
    return true;
  }

  private static int doorCnt = 1;
  private int doorNr;
  private Room room1;
  private Room room2;

}
