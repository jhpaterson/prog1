/**
 * Class Player
 * 
 * Represents a player in the game
 *
 * @version 1.0
 */
public class Player {

    // the player's name
    private String name;
    
    /**
     * Constructor for objects of class Player
     */
    public Player(String name) {
        this.name = name;
    }
    
    /**
     * the player takes a turn in the game
     */
    public void takeTurn()
    {
        System.out.println("Player " + name + " taking turn...");
    }
    
    /**
     * returns the name of this player
     */
    public String getName() {
        return name;
    }

    /**
     * set a new name for this player
     */
    public void setName(String name) {
        this.name = name;
    }
}
