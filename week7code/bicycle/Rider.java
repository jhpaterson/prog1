/**
 * class Rider models the behaviour of a rider 
 * controlling a bicycle
 * @author JP
 * @version 1.0
 */

public class Rider
{
    private String name;
    private Bicycle bicycle;
    
    /**
     * Constructor for objects of class Rider 
     */
    public Rider(String name)
    {
        this.name = name;
        this.bicycle = new Bicycle(0.4, 3);
    }
    
    /**
     * Constructor for objects of class Rider 
     */
    public Rider(String name, Bicycle bicycle)
    {
        this.name = name;
        this.bicycle = bicycle;
    }
    
    /**
     * gets the value of name
     * 
     * @return name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * gets the bicycle object
     * 
     * @return bicycle
     */
    public Bicycle getBicycle()
    {
        return this.bicycle;
    }
       
    /**
     * changes to a different bicycle
     * 
     * @param newBicycle
     */
    public void changeBicycle(Bicycle newBicycle)
    {
        this.bicycle = newBicycle;
    }
       
    /**
     * causes the rider to pedal faster
     * will change gear up if necessary
     * 
     */
    public void speedUp()
    {
        if((this.bicycle.getPedalRpm() + 50) > 300)
        {
            int currentGear = this.bicycle.getGear();
            changeUp();
            int newGear = this.bicycle.getGear();
            this.bicycle.setPedalRpm(this.bicycle.getPedalRpm() * currentGear / newGear);
        }
        else
        {
            this.bicycle.setPedalRpm(this.bicycle.getPedalRpm() + 50);
        }
    }
    
    /**
     * causes the rider to pedal more slowly
     * will change gear down if necessary
     * 
     */
    public void slowDown()
    {
        if(((this.bicycle.getPedalRpm() - 50) < 100) && (this.bicycle.getGear()>1))
        {
            int currentGear = this.bicycle.getGear();
            changeDown();
            int newGear = this.bicycle.getGear();
            this.bicycle.setPedalRpm(this.bicycle.getPedalRpm() * currentGear / newGear);
        }
        else
        {
            this.bicycle.setPedalRpm(this.bicycle.getPedalRpm() - 50);
        }
    }
    
    /**
     * gets the road speed of the bicycle in meters per second
     * 
     */
    public double speed()
    {
        return this.bicycle.speed();
    }
    
    private void changeUp()
    {
        this.bicycle.changeGear(1);
    }
    
    private void changeDown()
    {
        this.bicycle.changeGear(0);
    }
}
