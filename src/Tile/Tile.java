package Tile;

import Board.Board;
import Player.Player;

public abstract class Tile {
    public abstract void onStep(Player player, Board board);
}