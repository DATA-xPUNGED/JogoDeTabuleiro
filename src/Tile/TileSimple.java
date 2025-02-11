package Tile;

import Board.Board;
import Player.Player;

public class TileSimple {
    public void onStep(Player player, Board board){
        player.acquireCoin(1);
    }
}
