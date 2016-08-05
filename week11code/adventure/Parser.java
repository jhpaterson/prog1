import java.util.Scanner;

public class Parser
{
    private String[] commands;  // holds all valid command words
    private Scanner reader;         // source of command input

    /**
     * Create a parser to read from the terminal window.
     * 
     * @param commands   an array of valid command words
     */
    public Parser(String[] commands)
    {
        this.commands = commands;
        reader = new Scanner(System.in);
    }

    /**
     * builds a command from the user input
     *
     * @return the command built from the user input
     */
    public Command getCommand()
    {
        String inputLine;   // will hold the full input line
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // print prompt

        inputLine = reader.nextLine();

        // Find up to two words on the line.
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // get first word
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // get second word
                // note: we just ignore the rest of the input line.
            }
        }

        // check for valid command word
        if(!isValidCommand(word1))
        {
            word1 = "?";
        }

        //command = new Command(word1, word2);  // temporary
        return new Command(word1, word2);
    }

    private boolean isValidCommand(String commandWord)
    {
       boolean found = false;
       int i=0;
       while(!found && i<commands.length)
       {
           if(commands[i].equals(commandWord))
           {
               found = true;
           }
           i++;
       }
       return found;


    }

    /**
     * returns a list of valid command words formatted as a string
     *
     * @return the list of valid commands
     */
    public String showCommands()
    {
        String commandList = "";
        for(String command : commands)
        {
            commandList += command;
            commandList += " ";   // space between commands in list
        }
        return commandList;
    }
}