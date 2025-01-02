package Player;

import java.util.Random;

import Player.enums.Color;
import java.util.Random;

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
        return diceArray;
    }}
    
    

    
