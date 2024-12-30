
import java.util.Random;

public abstract class Player {
    protected String color;
    protected int position;
    protected int timesPlayed;

    public Player(String color){
        this.color = color;
        position = 0;
    }

    public String getColor() {
        return color;
    }
    public int getPosition() {
        return position;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public void movePosition(int value) {
        setPosition(getPosition() + value);
    }

    public int[] rollDice(){
        //rolls 2d6 and returns the results
        Random random = new Random();
        int[] diceArray = {random.nextInt(6) + 1, random.nextInt(6) + 1};
        System.out.println("Jogador da cor " + getColor() + " girou " + (diceArray[0] + diceArray[1]) + " nos dados");
        return diceArray;
    }
}
