
import java.awt.Color;

public class Player {

    private String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;

    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }

    public int getPosition() {
        return getPlayerPosn();
    }

    public String getName() {
        return name;
    }

    public void setPosition(int posn) {
        setPlayerPosn(posn);
    }

    public void incPosition(int posn) {
        setPlayerPosn(getPlayerPosn() + posn);
    }

    public void setPlayerColor(Color c) {
        playerColor = c;
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public void incPlayerScore(int a) {
        setPlayerScore(getPlayerScore() + a);
    }

    public int getPlayerScore() {
        return playerScore;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the playerPosn
     */
    public int getPlayerPosn() {
        return playerPosn;
    }

    /**
     * @param playerPosn the playerPosn to set
     */
    public void setPlayerPosn(int playerPosn) {
        this.playerPosn = playerPosn;
    }

    /**
     * @param playerScore the playerScore to set
     */
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

}
