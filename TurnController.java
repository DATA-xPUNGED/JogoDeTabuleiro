
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TurnController {
    private ArrayList<Player> playerList = new ArrayList<Player>();

    public void setupPlayers(){
        Scanner scanner = new Scanner(System.in);
        String input = "Você não deveria estar vendo isso!";
        Random random = new Random();
        System.out.print("Digite a cor de cada jogador seguido pela tecla ENTER. Quando estiver pronto, Apenas aperte ENTER, sem inserir nada.\n");
        while (true) {
            input = scanner.nextLine();
            if(input.isEmpty()){
                return;
            }
            Player newPlayer;
            switch (random.nextInt(3)) {
                case 0:
                    newPlayer = new PlayerUnlucky(input);
                    break;
                case 1:
                    newPlayer = new PlayerNormal(input);
                    break;
                case 2:
                    newPlayer = new PlayerLucky(input);
                    break;
                default:
                    newPlayer = new PlayerNormal(input);
                    break;
            }
            playerList.add(newPlayer);
        }
    }

    public void listPlayers(boolean listPosition){
        for(int i = 0; i < playerList.size(); i++){
            System.out.println("Jogador " + playerList.get(i).getColor() + "/n");
        }
    }

}