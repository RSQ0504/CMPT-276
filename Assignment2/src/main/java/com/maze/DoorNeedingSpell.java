package com.maze;

public class DoorNeedingSpell extends Doors{

  DoorNeedingSpell(Room r1, Room r2) {
    super(r1, r2);
  }

  @Override
  public String toString() {
    return "enchanted" + super.toString();
  }
}
