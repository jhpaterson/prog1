import java.util.ArrayList;

/**
 * Represents a player in the game
 *
 * @version 1.0
 */
public class Player {

    // the player's name
    private String name;
    // the room in which the player is currently located
    private Room currentRoom;
    
    /**
     * Constructor for objects of class Player
     */
    public Player(String name) {
        this.name = name;
    }
    
    /**
     * Take the player's turn in the game
     */
    public void takeTurn() 
    {
        System.out.println("Player " + name + " taking turn...");
        Item[] items = currentRoom.getItems();
        for(Item it : items)
        {
            if(it!=null)
            {
                it.use();
                if (it instanceof BonusItem)
                {
                    BonusItem bit = (BonusItem) it;
                    bit.bonus();
                }
            }
        }   
    }
    
    /**
     * Returns the name of this player
     * 
     * @return  the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set a new name for this player
     * 
     * @param name   the new name for the player
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns the room in which the player is currently located
     * 
     * @return  the room in which the player is currently located
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Sets the room in which the player is to be located
     * 
     * @param currentRoom  the room in which the player is to be located
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    
}
