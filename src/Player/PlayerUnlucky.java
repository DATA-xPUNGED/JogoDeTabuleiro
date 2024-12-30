package Player;
import java.util.Random;

public class PlayerUnlucky extends Player {

    public PlayerUnlucky(String color) {
        super(color);
    }
    @Override
    public int[] rollDice() {
        Random random = new Random();
        int[] diceArray = {random.nextInt(6) + 1, random.nextInt(6) + 1};
        while (diceArray[0] + diceArray[1] > 6) {
            diceArray[0] = random.nextInt(6) + 1;
            diceArray[1] = random.nextInt(6) + 1;
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
