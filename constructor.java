public class constructor {
    public static void main(String[] args) {
        construct newPlayer = new construct("Messi", 30);
        construct newPlayer1 = new construct("Ronaldo", 7);

        System.out.println(newPlayer.playername + " " + newPlayer.playernum);
        System.out.println(newPlayer1.playername + " " + newPlayer1.playernum);
    }
}