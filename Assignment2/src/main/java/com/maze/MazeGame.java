package com.maze;

public class MazeGame {
  public Maze createMaze(MazeFactory factory) {
    Maze template_Maze = factory.makeMaze();
    Room r1 = factory.createRoom();
    Room r2 = factory.createRoom();
    Doors theDoor = factory.makeDoors(r1,r2);
    template_Maze.add(r1);
    template_Maze.add(r2);
    r1.setside(Direction.North, factory.makeWall());
    r1.setside(Direction.East, theDoor);
    r1.setside(Direction.South, factory.makeWall());
    r1.setside(Direction.West, factory.makeWall());
    r2.setside(Direction.North,factory.makeWall());
    r2.setside(Direction.East, factory.makeWall());
    r2.setside(Direction.South, factory.makeWall());
    r2.setside(Direction.West, theDoor);
    return template_Maze;
  }
}
