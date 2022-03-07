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
  boolean enter() {
    return super.enter();
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
    return "Room #" + new Integer(roomNr).toString();
  }
  }
