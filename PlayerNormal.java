
public class PlayerNormal extends Player{
    public PlayerNormal(String color){
        super(color);
    }

    public int[] rollDice(){
        int diceArray[] = super.rollDice();
        timesPlayed++;
        return diceArray;
    }
}
