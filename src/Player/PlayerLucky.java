package Player;
import java.util.Random;

import Player.enums.Color;

public class PlayerLucky extends Player {

	public PlayerLucky(Color color) {
		super(color);
	}
	@Override
	 public int[] rollDice() {
	        Random random = new Random();
	        int[] diceArray = {random.nextInt(6) + 1, random.nextInt(6) + 1};
	        while (diceArray[0] + diceArray[1] < 7) {
	            diceArray[0] = random.nextInt(6) + 1;
	            diceArray[1] = random.nextInt(6) + 1;
	        }
	        int dice1 = diceArray[0];
	        int dice2 = diceArray[1];
	        int sumDice = dice1 + dice2;
	        System.out.println("Jogador da cor " + getColor() + " girou " + (diceArray[0] + diceArray[1]) + " nos dados");
	        movePosition(sumDice);
	        timesPlayed++;
	        return diceArray;
	    }

}
