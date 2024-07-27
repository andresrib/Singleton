package singleton;

public class Main {
    public static void main(String[] args) {

        CurrentGame game = CurrentGame.getInstancia();

        game.setFirstTeam("Pain Gaming");
        game.setSecondTeam("INTZ");
        System.out.println("Jogo atual entre " + game.getFirstTeam() + " e " + game.getSecondTeam());
    }
}