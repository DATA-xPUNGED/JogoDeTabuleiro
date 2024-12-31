package Tile;

import Player.Player;

public class TileStart extends Tile {

	@Override
	public void onStep(Player player, Board board) {
		System.out.println("você esta no começo,posição 0");
		
	}

}
