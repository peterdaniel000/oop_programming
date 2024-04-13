//inheritance (parent class)

class player {
    protected String name = "Someone1";
    public void newMessage() {
        System.out.println("This is someone1 message");
    }
}

class newPlayer extends player {
    String playerName = "Someone-P01";
}


public class inheritance {
    public static void main(String[] args) {
        newPlayer newSkilledPlayer = new newPlayer();
        newSkilledPlayer.newMessage();
        System.out.println(newSkilledPlayer.name + " " + newSkilledPlayer.playerName);
    }
}
