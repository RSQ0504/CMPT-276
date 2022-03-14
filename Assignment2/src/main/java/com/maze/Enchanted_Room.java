package com.maze;

import java.util.Scanner;

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
      System.out.println(this.toString() + " can be entered from" + getDirection(Direction.North).otherSideFrom(this).toString() + " with " + getDirection(Direction.North).toString());
      System.out.println("Please enter the spell");
      Scanner input=new Scanner(System.in);
      String Spell_receiver = input.next();
      if(Spell_receiver.equals(p.getSpell())) {
        System.out.println("Done");
        return true;
      }else{
        System.out.println("Wrong spell, can not enter "+this.toString());
        return false;
      }
    }
    if(getDirection(Direction.South).enter()) {
      System.out.println(this.toString() + " can be entered from" + getDirection(Direction.South).otherSideFrom(this).toString() + " with " + getDirection(Direction.South).toString());
      System.out.println("Please enter the spell");
      Scanner input=new Scanner(System.in);
      String Spell_receiver = input.next();
      if(Spell_receiver.equals(p.getSpell())) {
        System.out.println("Done");
        return true;
      }else{
        System.out.println("Wrong spell, can not enter "+this.toString());
        return false;
      }
    }
    if(getDirection(Direction.West).enter()) {
      System.out.println(this.toString() + " can be entered from" + getDirection(Direction.West).otherSideFrom(this).toString() + " with " + getDirection(Direction.West).toString());
      System.out.println("Please enter the spell");
      Scanner input=new Scanner(System.in);
      String Spell_receiver = input.next();
      if(Spell_receiver.equals(p.getSpell())) {
        System.out.println("Done");
        return true;
      }else{
        System.out.println("Wrong spell, can not enter "+this.toString());
        return false;
      }
    }
    if(getDirection(Direction.East).enter()) {
      System.out.println(this.toString() + " can be entered from " + getDirection(Direction.East).otherSideFrom(this).toString() + " with " + getDirection(Direction.East).toString());
      System.out.println("Please enter the spell");
      Scanner input=new Scanner(System.in);
      String Spell_receiver = input.next();
      if(Spell_receiver.equals(p.getSpell())) {
        System.out.println("Done");
        return true;
      }else{
        System.out.println("Wrong spell, can not enter "+this.toString());
        return false;
      }
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
