
public class PlayerUnlucky extends Player {

    public PlayerUnlucky(String color) {
        super(color);
    }
    @Override
    public int[] rollDice() {
        int diceArray[] = super.rollDice();
        //o resultado deve sempre ser menor ou igual a 6, então se não for, gire os dados denovo até ser.
        while (diceArray[0] + diceArray[1] > 6) {
            super.rollDice();
        }
        timesPlayed++;
        return diceArray;
    }
}
