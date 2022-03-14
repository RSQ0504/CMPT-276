package com.maze;

import java.util.Scanner;

public class DoorNeedingSpell extends Doors{

  DoorNeedingSpell(Room r1, Room r2) {
    super(r1, r2);
  }

  public boolean enter(){
    System.out.println("There is a doorNeedingSpell.");
    return true;
  }

  @Override
  public String toString() {
    return "enchanted" + super.toString();
  }
}
