package Tile;
import java.util.ArrayList;

import Player.Player;

public class Board {
    ArrayList<Tile> tileList = new ArrayList<>();
    public Board() {
        for (int i = 0; i < 41; i++) {
            if (i == 0) {
                tileList.add(new TileStart());
            } if (i == 10 || i == 25 || i == 38) {
                tileList.add(new TileDontPlay());
            } if (i == 13) {
            	tileList.add(new TileChange());
            }if( i== 5 ||i== 15 ||i== 30 ) {
            	tileList.add(new TileLucky());
            }if( i== 17 ||i== 27) {
            	tileList.add(new TileBeginning());
            }if(i== 20 ||i== 35) {
            	tileList.add(new TileSwitch());
            }if(i == 40 ) {
            	tileList.add(new TileFinish());
            }
        }
    }
    public void stepOnTile(Player player, int tileIndex) {
        if (tileIndex < 0 || tileIndex > tileList.size()) {
            System.out.println("Posição inválida no tabuleiro!");
            return;
        }
        System.out.println(player.getColor() + " pisou na posição " + tileIndex);
        Tile tile = tileList.get(tileIndex);

        tile.onStep(player, this);
    }
}
