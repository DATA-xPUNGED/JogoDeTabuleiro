package Tile;

import Player.Player;
import Player.PlayerUnlucky;

public class TileLucky extends Tile{
	@Override
    public void onStep(Player player){
        if(player instanceof PlayerUnlucky) {
            return;
        }
        player.movePosition(3);
    }
}