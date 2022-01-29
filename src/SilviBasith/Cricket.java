package SilviBasith;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;

    Cricket(String matchType,int over,Player players){
        this.matchType = matchType;
        this.over = over;
        this.player = players;

    }

    void display() {
        System.out.println("Match type :" + matchType);
        System.out.println("Over of the match :" + over);
        System.out.println("Name of the player :" + player.playerName);
        System.out.println("Jersey number of a player :" + player.jerseyNumber);
    }

}

/*
Name = Silvi Basith
ID = 2012020291
SEC = Regular
EMAIL = cse_2012020291@lus.ac.bd
DATE = 5.01.22
 */