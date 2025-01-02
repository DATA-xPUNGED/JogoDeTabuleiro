

public class TileLucky extends Tile{
	@Override
    public void onStep(Player player, Board board){
        if(player instanceof PlayerUnlucky) {
            return;
        }
        player.movePosition(3);
    }
}
