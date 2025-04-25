package homeworks.hw7;

public class Test {
    public static void main(String[] args) {
        Team barca = new Team("Barcelona");
        System.out.println("Rating of Barcelona with no players: " + barca.getRating());

        Stats messiStats = new Stats((byte) 75,(byte) 85,(byte) 84,(byte) 92,(byte) 67);
        Player messi = new Player("Messi", messiStats);

        barca.addPlayerToTheTeam(messi);
        System.out.println("Rating of Barcelona after adding Messi: " + barca.getRating());

        Stats piqueStats = new Stats((byte) 95,(byte) 82,(byte) 82,(byte) 89,(byte) 68);
        Player pique = new Player("Pique", piqueStats);
        barca.removePlayerFromTheTeam(pique);
        barca.addPlayerToTheTeam(pique);
        System.out.println("Rating of Barcelona after adding Pique: " + barca.getRating());

        barca.removePlayerFromTheTeam(pique);

        System.out.println("Rating of Barcelona after removing Pique: " + barca.getRating());

        Stats pique2Stats = new Stats((byte) 195,(byte) 82,(byte) 82, (byte) 89, (byte) 68);
        Player pique2 = new Player("Pique 2", pique2Stats);
        barca.addPlayerToTheTeam(pique2);
        barca.removePlayerFromTheTeam(pique2);

    }
}
