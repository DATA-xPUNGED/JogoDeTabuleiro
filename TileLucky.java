public class TileLucky extends Tile{
    public void onStep(Player player){
        if(player instanceof PlayerUnlucky) {
            return;
        }
        player.movePosition(3);
    }
}
