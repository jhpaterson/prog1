
/**
 * represents a bonus item
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BonusItem extends Item
{
    private String codeWord;

    /**
     * Constructor for objects of class BonusItem
     * 
     * @param description   a description of the item
     * @param codeWord   the secret code word
     */
    public BonusItem(String description, String codeWord)
    {
        super(description);
        this.codeWord = codeWord;
    }

    /**
     * bonus - prints secret codeword
     */
    public void bonus()
    {
        System.out.format("The secret code word for %s is %s\n",    
            description,codeWord);
    }
    
}
