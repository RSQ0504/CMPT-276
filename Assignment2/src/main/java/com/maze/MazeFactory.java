package com.maze;

public class MazeFactory {
  public Maze makeMaze(){
    return new Maze();
  }
  public Room createRoom(){
    return new Room();
  }
  public Wall makeWall(){
    return new Wall();
  }
  public Doors makeDoors(Room r1,Room r2){
    return new Doors(r1,r2);
  }
}
