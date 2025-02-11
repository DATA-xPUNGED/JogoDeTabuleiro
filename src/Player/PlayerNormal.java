package Player;

import Player.Player;
import Player.enums.Color;

import java.util.Random;

public class PlayerNormal extends Player{
    public PlayerNormal(Color color){
        super(color)
    }
    public int[] rollDice() {
        Random random = new Random();
        int[] diceArray = {random.nextInt(6) + 1, random.nextInt(6) + 1};
        return diceArray;
    }
}
