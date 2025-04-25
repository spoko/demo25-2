package homeworks.hw7;

public class Stats {
    private byte endurance;
    private byte sprint;
    private byte dribble;
    private byte passing;
    private byte shooting;

    public byte getEndurance() {
        return endurance;
    }

    public void setEndurance(byte endurance) {
        if (endurance >= 0 && endurance <= 100){
            this.endurance = endurance;
        }else {
            throw new RuntimeException("Endurance should be between 0 and 100.");
        }
    }

    public byte getSprint() {
        return sprint;
    }

    public void setSprint(byte sprint) {
        if (sprint >= 0 && sprint <= 100){
            this.sprint = sprint;
        }else {
            throw new RuntimeException("Sprint should be between 0 and 100.");
        }
    }

    public byte getDribble() {
        return dribble;
    }

    public void setDribble(byte dribble) {
        if (dribble >= 0 && dribble <= 100){
            this.dribble = dribble;
        }else {
            throw new RuntimeException("Dribble should be between 0 and 100.");
        }
    }

    public byte getPassing() {
        return passing;
    }

    public void setPassing(byte passing) {
        if (passing >= 0 && passing <= 100){
            this.passing = passing;
        }else {
            throw new RuntimeException("Passing should be between 0 and 100.");
        }
    }

    public byte getShooting() {
        return shooting;
    }

    public void setShooting(byte shooting) {
        if (shooting >= 0 && shooting <= 100){
            this.shooting = shooting;
        }else {
            throw new RuntimeException("Shooting should be between 0 and 100.");
        }
    }

    public Stats(byte endurance, byte sprint, byte dribble, byte passing, byte shooting){
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public float getOverallSkill(){
        return (float) (endurance + sprint + dribble + passing + shooting) / 5;
    }
}
