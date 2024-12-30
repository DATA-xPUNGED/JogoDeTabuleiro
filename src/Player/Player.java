package Player;

import java.util.Random;

import Player.enums.Color;

public abstract class Player {
    protected Color color;
    protected int position;
    protected int timesPlayed;

    public Player(Color color){
        this.color = color;
        position = 0;
    }

    public Color getColor() {
        return color;
    }
    public int getPosition() {
        return position;
    }
    public void setColor(Color color) {
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
        int dice1 = diceArray[0];
        int dice2 = diceArray[1];
        int sumDice = dice1 + dice2;
        System.out.println("Jogador da cor " + getColor() + " girou " + (diceArray[0] + diceArray[1]) + " nos dados");
        movePosition(sumDice);
        timesPlayed++;
        return diceArray;
    }
}
    
