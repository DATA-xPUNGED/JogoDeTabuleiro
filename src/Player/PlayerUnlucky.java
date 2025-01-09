package Player;
import java.util.Random;

import Player.enums.Color;

public class PlayerUnlucky extends Player {

 public PlayerUnlucky(Color color) {
        super(color);
    }
    @Override
    public int[] rollDice() {
        int diceArray[] = super.rollDice();
        //o resultado deve sempre ser menor ou igual a 6, então se não for, gire os dados denovo até ser.
        while (diceArray[0] + diceArray[1] > 6) {
            diceArray = super.rollDice();
        }
        int dice1 = diceArray[0];
        int dice2 = diceArray[1];
        int sumDice = dice1 + dice2;
        movePosition(sumDice);
        System.out.println("Jogador da cor " + getColor() + " girou " + (diceArray[0] + diceArray[1]) + " nos dados");
        timesPlayed++;
        return diceArray;
    }
}
