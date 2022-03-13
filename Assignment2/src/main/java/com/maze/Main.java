package com.maze;

public class Main {
  public static void main(String[] args){
    MazeFactory factory = new EnchantedMazeFactory();
    MazeGame game = new MazeGame();
    game.createMaze(factory);
  }
}
