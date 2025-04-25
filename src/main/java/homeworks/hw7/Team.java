package homeworks.hw7;

import java.util.LinkedList;

public class Team {
    private String name;
    private float rating;
    private LinkedList<Player> players = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            throw new RuntimeException("A name should not be empty.");
        }
    }

    public String getRating() {
        return String.format("%.0f", rating);
    }

    public Team(String name){
        setName(name);
    }

    public void addPlayerToTheTeam(Player player){
        players.add(player);
        calculateTeamRating();
    }

    public void removePlayerFromTheTeam(Player player){
        if (players.contains(player)){
            players.remove(player);
            calculateTeamRating();
        }else {
            throw new RuntimeException("Player [" + player.getName() +
                    "] is not in [" + name + "] team. ");
        }
    }

    private void calculateTeamRating(){
        float tmpRating = 0;

        for (Player player : players){
            tmpRating += player.getOverallSkill();
        }

        rating = (tmpRating / players.size());
    }
}
