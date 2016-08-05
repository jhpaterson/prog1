 import java.util.Scanner;
 
/**
 * Sets up and controls the game
 *
 * @version 1.0
 */
public class Game 
{
    // the starting room
    private Room startingRoom;
    // the player in the game
    private Player player;
       
    /**
     * Create the game and initialise it
     */
    public Game() 
    {
        setUp();
    }

    /**
     * Initialize the game world
     */
    private void setUp()
    {
        printWelcome();
        createRooms();
        System.out.print("Please enter your name\n>");
        Scanner in = new Scanner(System.in);
        String playerName = in.nextLine();
        player = new Player(playerName);
        player.setCurrentRoom(startingRoom);
    }
    
     /**
     * Create a starting room
     */
    private void createRooms()
    {
        Room outside;
      
        // create the rooms
        outside = new Room("outside the main entrance of the university");
        outside.addItem(new Item("phone"));
        outside.addItem(new Item("bin"));
           
        startingRoom = outside;  // start game outside
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.       
        boolean finished = true;   // put this in temporarily so game finishes after one turn
        do
        {
            System.out.println("Player: " + player.getName());
            player.takeTurn();
        } while (! finished);
        
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message 
     */
    private void printWelcome()
    {
        String welcome = "\n";
        welcome += "Welcome to the World of GCU!" + "\n";
        welcome += "World of GCU is a new, incredibly boring adventure game." + "\n";
        welcome += "\n";
        System.out.print(welcome);      
    }
    
   /**
    * Create and play a game.
    */
    public static void main(String [] args) {
        Game game = new Game();
        game.play();
    }
}
