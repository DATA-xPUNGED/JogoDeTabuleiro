package Tile;
import java.lang.reflect.Array;
import java.util.ArrayList;

import Player.Player;

public class Board {
    ArrayList<Tile> tileList = new ArrayList<>();
    public Board() {
        for (int i = 0; i < 40; i++) {
            int tilePosition = i + 1; //para que possamos inserir tiles como a gente normalmente pensa neles, 
            //começando no 1 e terminando no 40, mesmo que sejam do 0 ao 39 no código
            if (tilePosition == 1) {
                tileList.add(new TileStart());
            } if (tilePosition == 10 || tilePosition == 25 || tilePosition == 38) {
                tileList.add(new TileDontPlay());
            } if (tilePosition == 13) {
            	tileList.add(new TileChange());
            }if( tilePosition == 5 ||tilePosition == 15 ||tilePosition == 30 ) {
            	tileList.add(new TileLucky());
            }if( tilePosition == 17 ||tilePosition == 27) {
            	tileList.add(new TileBeginning());
            }if(tilePosition == 20 ||tilePosition == 35) {
            	tileList.add(new TileSwitch());
            }if(tilePosition == 40 ) {
            	tileList.add(new TileFinish());
            }else{
                tileList.add(new TileBasic());
            }
        }
    }
    public ArrayList<Tile> getTiles(){
        return tileList;
    }

    public void stepOnTile(Player player) {
        int playerPosition = player.getPosition();
        if (playerPosition < 0 || playerPosition > 39) {
            System.out.println("Posição inválida no tabuleiro!");
            return;
        }
        System.out.println(player.getColor() + " pisou na posição " + (playerPosition + 1));
        Tile tile = tileList.get(playerPosition);

        tile.onStep(player, this);
    }
}
