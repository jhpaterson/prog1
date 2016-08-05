
/**
 * Represents an item which can be used by a player
 *
 * @version 1.0
 */
public class Item
{
    private String description;    

    /**
     * Constructor for objects of type Item
     *
     * @param description   value for the description 
     */
    public Item(String description)
    {
        this.description = description;
    }

    /**
     * Returns the description of the item
     *
     * @return    the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the value of description
     *
     * @param  description   the new value of description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    
    /**
     * Use the item
     * 
     */
    public void use()
    {
        System.out.format("You are using item: %1$s\n", description);
    }
    
    /**
     * Returns a String representation of this object
     *
     * @return  a String represention of this object
     */
    public String toString()
    {
        return "description: " + description;
    }
    
}


