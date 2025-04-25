package homeworks.hw7;

public class Player {
    private String name;
    private Stats stats;

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

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        if (!stats.equals(null)){
            this.stats = stats;
        }else {
            throw new RuntimeException("Stats can not be empty.");
        }
    }

    public Player(String name, Stats stats){
        setName(name);
        setStats(stats);
    }

    public float getOverallSkill(){
        return stats.getOverallSkill();
    }
}
