
/**
 * contains the main method for a program
 * 
 * @author JP
 * @version 1.0
 */
public class Program
{
     public static void main(String[] args)
    {
        // simple program
                Rider r = new Rider("Jim");
                System.out.println("speed: " + r.speed() + "rpm");
                r.speedUp();
                System.out.println("speed: " + r.speed() + "rpm");
        
        // running test in test class
        //RiderTest rt = new RiderTest();
        //rt.testChangingSpeed();
    }
}
