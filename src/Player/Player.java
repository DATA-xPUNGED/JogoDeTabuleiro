package Player;

import java.util.Random;

import Player.enums.Color;

public class Player {
    protected Color color;
    protected int coin;
    protected int position = 0;
    protected int timesPlayed;
    protected boolean stunned;

    public Player(Color color){
        this.color = color;
        position = 0;
        stunned = false;
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
        position = position + value;
    }

    public boolean getStunned(){
        return stunned;
    }

    public void setStunned(boolean stunned){
        this.stunned = stunned;
    }

    public int[] rollDice() {
        Random random = new Random();
        int[] diceArray = {random.nextInt(6) + 1, random.nextInt(6) + 1};
        return diceArray;
    }

    public int[] doTurn(){
        int[] diceArray = rollDice();
        // Exibe o resultado de cada dado
        System.out.println("Jogador da cor " + getColor() + " girou " + diceArray[0] + " e " + diceArray[1] + " nos dados");

        // Calcula a soma e movimenta
        int sumDice = diceArray[0] + diceArray[1];
        movePosition(sumDice);

        // Exibe a movimentação
        System.out.println("Jogador da cor " + getColor() + " avançou " + sumDice + " casas e está na posição " + position);

        // Verifica se os valores são duplicados
        while (diceArray[0] == diceArray[1]) {
            System.out.println("Jogador da cor " + getColor() + " tirou valores duplicados e jogará novamente!");
            diceArray = rollDice();
            System.out.println("Jogador da cor " + getColor() + " girou " + diceArray[0] + " e " + diceArray[1] + " nos dados");
            sumDice = diceArray[0] + diceArray[1];
            movePosition(sumDice);
            System.out.println("Jogador da cor " + getColor() + " avançou " + sumDice + " casas e está na posição " + position);
        }

        timesPlayed++;
        return diceArray;
    }
}
    
    

    