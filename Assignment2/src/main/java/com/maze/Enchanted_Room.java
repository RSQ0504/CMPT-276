package com.maze;

public class Enchanted_Room extends Room{
  private Spell p;
  Enchanted_Room(Spell s) {
    super();
    this.setSpell(s);
  }

  public void setSpell(Spell s){
    this.p = s;
  }

  public String toString() {
    return "enchanted" + super.toString()+" (Spell is "+p.getSpell()+")";
  }
}
