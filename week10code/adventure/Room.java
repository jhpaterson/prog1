import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a room in the game
 *
 * @version 1.0
 */
public class Room
{
    // a description of the room
    private String description;   
    // the items in the room
    private ArrayList<Item> items; 
    // the exits from the room
    private HashMap<String, Room> exits;
    
    /**
     * Constructor for objects of type Room
     * 
     * @param description   a description of the room
     */
    public Room(String description) 
    {
        this.description = description;
        items = new ArrayList<Item>();   
        exits = new HashMap<String, Room>();
    }
    
    /**
     * Returns the description of the room
     * 
     * @return  the description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Adds a new item to the room
     * 
     * @param newItem  the item to add
     */
    public void addItem(Item newItem)
    {
        items.add(newItem);
    }
    
    /**
     * Returns the items in the room
     * 
     * @return  the items
     */
    public Item[] getItems()
    {
        return items.toArray(new Item[items.size()]);
    }
    
 
    /**
     * Returns the item with a specified description
     * 
     * @param description   the description of the specified item
     * @return  the specified item
     */
    public Item getItem(String description)
    {
        Item target = new Item(description);
	    int pos = items.indexOf(target);     // uses equals method of Item
	    if (pos!=-1)
      	   return items.get(pos);
    	else
      	  return null;
    }
    
    /**
     * Define an exit from this room.
     * 
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        // adds a Room object to the HashMap with a String label
        exits.put(direction, neighbor);
    }
    
    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * 
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
         // gets the Room object stored with the specified label
         return exits.get(direction);
    }
    
    /**
     * Removes the specified item from the room
     * 
     * @param description   the description of the specified item
     */
    public void removeItem(String description)
    {
         Item target = new Item(description);
	     int pos = items.indexOf(target);    // uses equals method of Part
	     if (pos!=-1)
      	    items.remove(pos);   	    
    }
}
