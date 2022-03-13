package com.maze;

import java.util.Scanner;

public class DoorNeedingSpell extends Doors{
  public String Spell_receiver;

  DoorNeedingSpell(Room r1, Room r2) {
    super(r1, r2);
  }

  public boolean enter(){
    System.out.println("There is a doorNeedingSpell. Please enter the Spell");
    Scanner input=new Scanner(System.in);
    Spell_receiver = input.next();
    return true;
  }

  @Override
  public String toString() {
    return "enchanted" + super.toString();
  }
}
