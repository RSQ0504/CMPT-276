package com.maze;

public class Room extends Mapsite{

  private int roomNr;
  private static int roomCnt = 1;
  private Mapsite northSide;
  private Mapsite southSide;
  private Mapsite eastSide;
  private Mapsite westSide;

  Room() {
    Mapsite result = null;
    roomNr = roomCnt++;
  }

  @Override
  public boolean enter() {
    if(northSide.enter()|| southSide.enter() || eastSide.enter() || westSide.enter()){
      if(northSide.enter())
        System.out.println("Enter "+northSide.otherSideFrom(this).toString());
      if(southSide.enter())
        System.out.println("Enter "+southSide.otherSideFrom(this).toString());
      if(westSide.enter())
        System.out.println("Enter "+westSide.otherSideFrom(this).toString());
      if(eastSide.enter())
        System.out.println("Enter "+eastSide.otherSideFrom(this).toString());
      return true;
    }
    System.out.println("this room has no door :)");
    return false;
  }

  public void setside(Direction direction, Mapsite site){
    switch(direction){
      case North:
        northSide = site;
        break;
      case South:
        southSide = site;
        break;
      case East:
        eastSide = site;
        break;
      case West:
        westSide = site;
        break;
    }
    System.out.println("setting "+direction.toString()+" side of "+this.toString()+" to "+site.toString());
  }
  public Mapsite getDirection(Direction direction){
    Mapsite result = null;
    switch (direction){
      case South:
        result = southSide;
        break;
      case West:
        result = westSide;
        break;
      case East:
        result = eastSide;
        break;
      case North:
        result = northSide;
        break;
    }
    return result;
  }
  public String toString() {
    return "Room #" + roomNr;
  }
  }
