package com.maze;

public class Main {
  public static void main(String[] args){
    MazeFactory factory = new EnchantedMazeFactory();
    MazeGame game = new MazeGame();
    Maze maze = game.createMaze(factory);
    Room start = maze.getStartRoom();
    start.otherSideFrom(start).enter();
    start.enter();
  }
}
