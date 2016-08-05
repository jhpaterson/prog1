
/**
 * Represents a room in the game
 *
 * @version 1.0
 */
public class Room
{
    // a description of the room
    private String description;   
    // the maximum number of ITEMS
    private static final int MAX_ITEMS = 20; 
    // the number of items currently in the room
    private int numberOfItems;
    // the items in the room
    private Item[] items;  
    
    /**
     * Constructor for objects of type Room
     * 
     * @param description   a description of the room
     */
    public Room(String description) 
    {
        this.description = description;
        items = new Item[MAX_ITEMS];   
        numberOfItems = 0;
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
        // check for array full
        if(numberOfItems < MAX_ITEMS)       // check array is not full
        {
           items[numberOfItems] = newItem;
           numberOfItems++;            // increment by one
        }  

        // catch exception if array full
//         try   
//         {
//             items[numberOfItems] = newItem;
//             numberOfItems++;            // increment by one
//         }  
//         catch(IndexOutOfBoundsException e)
//         {
//             System.out.println("Cannot add at position " + e.getMessage());
//             //e.printStackTrace();
//         }
    }
    
    /**
     * Returns the items in the room
     * 
     * @return  the items
     */
    public Item[] getItems()
    {
        return items;
    }
    
  // WRONG!
  public Item getItem(String description)
  {
       int i = 0;
       boolean found = false;
       // should have Item target = null;
       while(!found && i<numberOfItems)
       {
           if(items[i].getDescription().equals(description))
           {
               // should do target = items[i];
               found = true;
           }
           i++;
       }
       return items[i];     // should return target
  }

  // RIGHT!
    /**
     * Returns the item with a specified description
     * 
     * @param description   the description of the specified item
     * @return  the specified item
     */
    /*public Item getItem(String description)
    {
        int i = 0;
        boolean found = false;      // flag to indicate whether item is found
        Item target = null;
        
        // loop until found or all items checked 
        while(!found && i<numberOfItems)
        {
           if(items[i].getDescription().equals(description))
           {
               target = items[i];
               found = true;
           }
           i++;
        }
        return target;
        //return items[i];
    }*/
    
    /**
     * Removes the specified item from the room
     * 
     * @param description   the description of the specified item
     */
    public void removeItem(String description)
    {
         int i = 0;
         boolean found = false;
         while(i<numberOfItems)
         {
             if(items[i].getDescription().equals(description))
             {
                found = true;
                break;
             }
             i++;
         }
         if(found)
         {
             for(int j=i;j<numberOfItems;j++)
             {
                items[j] = items[j+1];
             }
             items[numberOfItems]=null;
             numberOfItems--;
       }
    }
}
