package Player;

public class NotEnoughCoinException extends Exception{
    public String toString(){
        return "Você não tem moedas suficientes para isso!";
    }
}
