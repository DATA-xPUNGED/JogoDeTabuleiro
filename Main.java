public class Main {
    public static void main(String[] args) {
        TurnController turnController = new TurnController();
        turnController.setupPlayers();
        turnController.listPlayers(false);
    }
}
