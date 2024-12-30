package Player;
public class PlayerLucky extends Player {

    public PlayerLucky(String color) {
        super(color);
    }
    @Override
    public int[] rollDice() {
        int diceArray[] = super.rollDice();
        //o resultado deve sempre ser maior ou igual a 6, então se não for, gire os dados denovo até ser.
        while (diceArray[0] + diceArray[1] < 6) {
            super.rollDice();
        }
        timesPlayed++;
        return diceArray;
    }
}
