package uk.ac.gcu.adventure; 
  
/**
 * Sets up and controls the game
 *
 * @version 1.0
 */
public class Game 
{
    // the starting room
    private Room startingRoom;
    // the players in the game
    private Player player;
 
       
    /**
     * Create the game and initialise it
     */
    public Game() 
    {
        setUp("Bob");
    }
    
    public Player getPlayer()
    {
        return player;
    }

    /**
     * Initialize the game world
     */
    private void setUp(String playerName)
    {
        createRooms();
        player = new Player(playerName);
        player.setCurrentRoom(startingRoom);
    }
    
     /**
     * Create the rooms in the game world
     */
    private void createRooms()
    {
        Room outside, theatre, pub, lab, office;
        
        // create the rooms and put some items in them
        outside = new Room("outside the main entrance of the university");
        outside.addItem(new Item("phone"));
        outside.addItem(new Item("bin"));
        
        theatre = new Room("in a lecture theatre");
        theatre.addItem(new Item("projector"));
        theatre.addItem(new BonusItem("screen","BLUEJ"));
        
        pub = new Room("in the campus pub");
        pub.addItem(new Item("fruit machine"));
        
        lab = new Room("in a computing lab");
        lab.addItem(new BonusItem("computer","JAVA"));
        lab.addItem(new Item("printer"));
        
        office = new Room("in the computing admin office");
        office.addItem(new Item("computer"));
        office.addItem(new Item("filing cabinet"));
        
        // initialise room exits
        outside.setExit("west", theatre);
        outside.setExit("south", lab);
        outside.setExit("east", pub);

        theatre.setExit("east", outside);

        pub.setExit("west", outside);

        lab.setExit("north", outside);
        lab.setExit("west", office);

        office.setExit("east", lab);


        startingRoom = outside;  // start game outside
    }
    
}
