package game;

import java.util.ArrayList;
import java.util.Scanner;

import Board.Board;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        //criar board
        boolean debugMode = false;
        game.setupPlayers();
        Game.listPlayers(false);
        String continueConfirmation;
        Scanner input = new Scanner(System.in);
        ArrayList<Player> playerList = Game.getPlayers();
        playerList = definePlayerOrder(playerList, input);
        
    
        boolean winCondition = false;
       
        while (!winCondition) {
            for (Player currentPlayer : playerList) {
                executeTurn(currentPlayer, debugMode, input);
                board.stepOnTile(currentPlayer);
                if (currentPlayer.getPosition() >= 40) {
                    winCondition = true;
                    System.out.println("Jogador " + currentPlayer.getColor() + " ganhou!");
                    break;
                }
            }
            Game.listPlayers(true);
            System.out.println("Pressione Enter para continuar...");
            input.nextLine();
        }
        
    }

    
    public static void executeTurn(Player player, boolean debugMode, Scanner input){
        if (debugMode) {//no modo DEBUG você manualmente insere o valor a se mover
           
            System.out.println("Insira um valor para o jogador " + player.getColor() + " mover");
            int valueToMove = input.nextInt();
            input.nextLine(); 
            player.movePosition(valueToMove);
           
        }else{
            player.doTurn();
    }
        
}
    public static ArrayList<Player> definePlayerOrder(ArrayList<Player> playerList, Scanner input) {
        ArrayList<Player> orderedPlayers = new ArrayList<>();

        System.out.println("Escolha a ordem dos jogadores digitando as cores na sequência desejada:");

        for (int i = 0; i < playerList.size(); i++) {
            System.out.print("Digite a cor do jogador " + (i + 1) + ": ");
            String colorInput = input.nextLine().trim().toUpperCase();
            Player selectedPlayer = null;

            for (Player player : playerList) {
                if (player.getColor().name().equals(colorInput)) {
                    selectedPlayer = player;
                    break;
                }
            }

            if (selectedPlayer != null && !orderedPlayers.contains(selectedPlayer)) {
                orderedPlayers.add(selectedPlayer);
            } else {
                System.out.println("Cor inválida ou já selecionada, tente novamente.");
                i--; // Repetir a entrada para o mesmo jogador
            }
        }

        System.out.println("Ordem dos jogadores definida:");
        for (Player player : orderedPlayers) {
            System.out.println(player.getColor().name());
        }

        return orderedPlayers;
    }
    }