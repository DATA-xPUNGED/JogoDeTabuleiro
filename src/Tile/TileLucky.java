package Tile;
import Board.Board;
import Player.Player;
import Player.PlayerUnlucky;

public class TileLucky extends Tile{
	@Override
    public void onStep(Player player, Board board){
        if(player instanceof PlayerUnlucky) {
            return;
        }
        System.out.println("A sorte está com você! " + player.getColor() + " move 3 espaços a frente.");
        player.movePosition(3);
    }
}