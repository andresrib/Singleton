package singleton;

public class CurrentGame {
    private String firstTeam;
    private String secondTeam;
    private static CurrentGame singleton = new CurrentGame();

    private CurrentGame(){
        super();
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    public static CurrentGame getInstancia(){
        return singleton;
    }
}
