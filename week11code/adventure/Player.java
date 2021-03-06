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
    // valid command words
    private String[] commands = {"go","quit","help"};

    /**
     * Constructor for objects of class Player
     * 
     * @param name  the player's name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Take the player's turn in the game
     *
     * @return true if quit flag is to be set in the game
     */
    public boolean takeTurn()
    {
        Parser parser = new Parser(commands);
        Command command = parser.getCommand();
        return processCommand(command);
    }

     /**
     * Given a command, process (that is: execute) the command.
     *
     * @param command the command to be processed.
     * @return "true" if the command ends the game, no response otherwise.
     */
    private boolean processCommand(Command command)
    {
        boolean quit = false;

        String commandWord = command.getCommandWord();

        /*
        if(commandWord.equals("?")) {
            System.out.println("I don't know what you mean...");
        }
        else if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            System.out.println("the game will finish at the end of this round");
            quit = true;
        }*/

        switch(commandWord)
        {
            case "?":
                System.out.println("I don't know what you mean...");
                break;
            case "help":
                 printHelp();
                 break;
            case "go":
                 goRoom(command);
                 break;
            case "quit":
                 quit = true;
                 break;
        }

        return quit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     * 
     * @return a list of valid command words
     */
    private String printHelp()
    {
        String help = "You are lost. You are alone. You wander" + "\n";
        help += "around at the university." + "\n";
        help += "Your command words are:" +  "\n";
        //help += parser.showCommands();
        for(String command : commands)
        {
            help += command;
            help += " ";   // space between commands in list
        }
        System.out.println(help);
        return help;
    }

    /**
     * Try to go to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     * 
     * @param command  the Command object which caused the player to navigate
     */
    private void goRoom(Command command)
    {
        //String roomInfo = "";
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
        }
        else
        {

            String direction = command.getSecondWord();

            // Try to leave current room.
            Room nextRoom = this.getCurrentRoom().getExit(direction);

            if (nextRoom == null) {
                System.out.println("There is no door!");
            }
            else
            {
                this.setCurrentRoom(nextRoom);
                System.out.println(this.getCurrentRoom().getDescription());
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
