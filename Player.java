package Package;

import java.util.ArrayList;

public class Player {

    private String Name;
    private int Chips;
    private int Bet;
    private String PlayerType;
    private String PlayerIcon;

    private ArrayList<Card> Hand = new ArrayList<Card>();

    public Player(String Name, int Chips, String PlayerType) {
        this.Name = Name;
        this.Chips = Chips;
        this.Bet = 0;
        this.PlayerType = PlayerType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public int getChips() {
        return Chips;
    }

    public void setChips(int Chips) {
        this.Chips = Chips;
    }

    public int getBet() {
        return Bet;
    }

    public void setBet(int Bet) {
        this.Bet = Bet;
    }

    public String getPlayerType() {
        return PlayerType;
    }

    public void setPlayerType(String PlayerType) {
        this.PlayerType = PlayerType;
    }
}
