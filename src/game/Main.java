package game;

import Tile.Board;

import java.util.ArrayList;
import java.util.Scanner;

import Player.Player;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board();
        boolean debugMode = false;
        game.setupPlayers();
        Game.listPlayers(false);
        String continueConfirmation;

        ArrayList<Player> playerList = Game.getPlayers();
        int i;
        boolean winCondition = false;
        while (winCondition == false) {
            for(i = 0; i < playerList.size(); i++){
                Player currentPlayer = playerList.get(i);
                executeTurn(currentPlayer, debugMode);
                board.stepOnTile(currentPlayer);
            }
            Game.listPlayers(true);
            //colocar algo aqui para pausar até ter input
        }
    }

    public static void executeTurn(Player player, boolean debugMode){
        int diceResult = 0;
        if (debugMode) {//no modo DEBUG você manualmente insere o valor a se mover
            Scanner input = new Scanner(System.in);
            System.out.println("Insira um valor para o jogador " + player.getColor() + " mover");
            input.nextInt();
            input.close();
        }else{
            int diceRoll[] = player.rollDice();
            diceResult = diceRoll[0] + diceRoll[1];
        }
        player.movePosition(diceResult);
        if(player.getPosition() > 39)
            player.setPosition(39);
    }
}
