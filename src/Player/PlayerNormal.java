package Player;

import Player.enums.Color;

public class PlayerNormal extends Player{
    public PlayerNormal(Color color){
        super(color);
    }

    public int[] rollDice(){ 
        int diceArray[] = super.rollDice();
        System.out.println("Jogador da cor " + getColor() + " girou " + (diceArray[0] + diceArray[1]) + " nos dados");
        return diceArray;
    }
}