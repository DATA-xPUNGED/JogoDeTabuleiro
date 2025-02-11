package Tile;

import Board.Board;
import Player.Player;

public class TilePrison extends Tile{
	@Override
	public void onStep(Player player, Board board) {
		player.setImprisoned(true);
		System.out.println("Jogador " + player.getColor() + " foi preso!");
	}

}