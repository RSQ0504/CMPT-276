package com.maze;

import java.util.Scanner;

public class Spell {
  private String p;
  public String getSpell(){
    return p;
  }

  Spell(){
  }

  public void setSpell() {
    System.out.println("set up a Spell");
    Scanner input=new Scanner(System.in);
    p = input.next();
  }

}
