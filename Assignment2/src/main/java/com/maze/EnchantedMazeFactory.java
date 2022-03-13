package com.maze;

public class EnchantedMazeFactory extends MazeFactory{
  private Spell castSpell(){
    return new Spell();
  }
  public Room createRoom(){
    return new Enchanted_Room(castSpell());
  }

  @Override
  public Doors makeDoors(Room r1, Room r2) {
    return new DoorNeedingSpell(r1, r2);
  }
}
