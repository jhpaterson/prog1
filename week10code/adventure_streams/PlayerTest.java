

/**
 * The test class PlayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PlayerTest extends junit.framework.TestCase
{
	private Room room1;
	private Item item1;
	private Item item2;
	private Item item3;
	private Player player1;

	
	
	
	
	

	
	
	
	

    /**
     * Default constructor for test class PlayerTest
     */
    public PlayerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
		room1 = new Room("kitchen");
		item1 = new Item("cooker");
		item2 = new Item("fridge");
		item3 = new Item("knife");
		room1.addItem(item1);
		room1.addItem(item2);
		room1.addItem(item3);
		player1 = new Player("Joe");
		player1.setCurrentRoom(room1);
	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
}
