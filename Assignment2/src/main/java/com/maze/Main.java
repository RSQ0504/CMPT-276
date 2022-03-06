package com.maze;

public class Main {
  public static void main(String[] args){
    MazeFactory factory = new MazeFactory();
    MazeGame game = new MazeGame();
    game.createMaze(factory);
  }
}
