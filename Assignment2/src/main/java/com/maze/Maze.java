package com.maze;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Maze {
  private Set<Room> rooms = new HashSet<Room>();
  public void add(Room r){
    if(!rooms.contains(r)){
      rooms.add(r);
    }
  }
  public Room getStartRoom(){
    Iterator<Room> iterator = rooms.iterator();
    return iterator.next();
  }
}
