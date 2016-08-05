
/**
 * test class for class Rider
 * 
 * @author JP 
 * @version 1.0
 */
public class RiderTest
{
    /**
     * tests that the rider can make the bicycle speed up and slow down
     * and change gear where appropriate
     */
    public void testChangingSpeed()
    {
       Rider r = new Rider("Jim");
       
       System.out.println("STARTING");
       System.out.println("speed: " + r.speed() + "\n");
       
       System.out.println("SPEEDING UP");
       for(int i=0; i< 15; i++)
       {
           r.speedUp();
           System.out.println("---------------------------------");
           System.out.println("speed: " + r.speed());
           System.out.println("gear: " + r.getBicycle().getGear());
       }
       
            //        System.out.println("SLOWING DOWN");
            //        for(int i=0; i< 15; i++)
            //        {
            //            r.slowDown();
            //            System.out.println("speed: " + r.speed());
            //            System.out.println("gear: " + r.getBicycle().getGear());
            //        }
    
    }
}
