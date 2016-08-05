public class Command
{
    private String commandWord;
    private String secondWord;

    /**
     * constructor for objects of type Command
     * 
     * @param commandWord  the command word
     * @param secondWord   the second word of the comment
     */
    public Command(String commandWord, String secondWord)
    {
        this.commandWord = commandWord;
        this.secondWord = secondWord;
    }

    /**
     * return the command word (the first word) of this command.
     *
     * @return The command word.
     */
    public String getCommandWord()
    {
        return commandWord;
    }

    /**
     * return the second word of this command. Returns null if there was no
     * second word.
     *
     * @return The second word of this command.
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * checks whether the command was understood
     *
     * @return true if this command was not understood.
     */
    public boolean isUnknown()
    {
        return (commandWord.equals("?"));
    }

    /**
     * checks whether the command has a second word
     *
     * @return true if the command has a second word.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}

