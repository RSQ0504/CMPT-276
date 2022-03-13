package com.maze;

import java.util.Scanner;

public class Spell {
  private String p;
  public String getSpell(){
    return p;
  }

  Spell(){
    System.out.println("set up a Spelling");
    Scanner input=new Scanner(System.in);
    setSpell(input.next());
  }

  public void setSpell(String p) {
    this.p = p;
  }

}
