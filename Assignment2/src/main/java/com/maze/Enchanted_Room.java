package com.maze;

public class Enchanted_Room extends Room{
  private Spell p;
  Enchanted_Room(Spell s) {
    super();
    System.out.println("This is an enchanted room");
    this.setSpell(s);
    p.setSpell();
  }

  public boolean enter() {
    if(getDirection(Direction.North).enter()) {
      System.out.println(this.toString() + " can enter " + getDirection(Direction.North).otherSideFrom(this).toString() + " with " + getDirection(Direction.North).toString());
      return true;
    }
    if(getDirection(Direction.South).enter()) {
      System.out.println(this.toString() + " can enter " + getDirection(Direction.South).otherSideFrom(this).toString() + " with " + getDirection(Direction.South).toString());
      return true;
    }
    if(getDirection(Direction.West).enter()) {
      System.out.println(this.toString() + " can enter " + getDirection(Direction.West).otherSideFrom(this).toString() + " with " + getDirection(Direction.West).toString());
      return true;
    }
    if(getDirection(Direction.East).enter()) {
      System.out.println(this.toString() + " can enter " + getDirection(Direction.East).otherSideFrom(this).toString() + " with " + getDirection(Direction.East).toString());
      return true;
    }
    System.out.println("this room has no door :)");
    return false;
  }

  public void setSpell(Spell s){
    this.p = s;
  }

  public String toString() {
    return "enchanted" + super.toString()+" (Spell is "+p.getSpell()+")";
  }
}
