package Board;
import java.util.ArrayList;

import Player.Player;
import Tile.Tile;
import Tile.TileBeginning;
import Tile.TileChange;
import Tile.TilePrison;
import Tile.TileFinish;
import Tile.TileLucky;
import Tile.TileSwitch;
import Tile.TileStart;
import Tile.TileSimple;

public class Board {
    private static Board uniqueBoard;
    ArrayList<Tile> tileList = new ArrayList<>();

    private Board() {
        for (int i = 0; i < 41; i++) {
            int tilePosition = i ; //para que possamos inserir tiles como a gente normalmente pensa neles, 
            //começando no 1 e terminando no 40, mesmo que sejam do 0 ao 39 no código
            if (tilePosition == 0) {
                tileList.add(new TileStart());
            }else if (tilePosition == 10 || tilePosition == 25 || tilePosition == 38) {
                tileList.add(new TilePrison());
            }else  if (tilePosition == 13) {
            	tileList.add(new TileChange());
            }else if( tilePosition == 5 ||tilePosition == 15 ||tilePosition == 30 ) {
            	tileList.add(new TileLucky());
            }else if( tilePosition == 17 ||tilePosition == 27) {
            	tileList.add(new TileBeginning());
            }else if(tilePosition == 20 ||tilePosition == 35) {
            	tileList.add(new TileSwitch());
            }else if(tilePosition == 40 ) {
            	tileList.add(new TileFinish());
            }else{
                tileList.add(new TileSimple());
            }
        }
    }

    public static synchronized Board getInstanceBoard(){
        if (uniqueBoard == null)
            uniqueBoard = new Board();
        return uniqueBoard;
    }
    
    public ArrayList<Tile> getTiles(){
        return tileList;
    }

    public void stepOnTile(Player player) {
        int playerPosition = player.getPosition();
        if (playerPosition < 0 || playerPosition > 40) {
            System.out.println("Posição inválida no tabuleiro!");
            return;
        }
        System.out.println("jogador " + player.getColor() + " pisou na posição " + (playerPosition ));
        Tile tile = tileList.get(playerPosition);

        tile.onStep(player, this);
    }
}