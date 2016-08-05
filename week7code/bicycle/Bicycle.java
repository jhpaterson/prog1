/**
 * class Bicycle models the behaviour of a bicycle when pedal RPM 
 * and gear are changed
 * 
 * @author JP
 * @version 1.0
 */
public class Bicycle
{
    private int pedalRpm;                            //instance variables
    private int gear;
    private double wheelDiameter;
    private int numberOfGears;    

    /**
     * Constructor for objects of class Bicycle
     * 
     * @oparam wheelDiameter in meters
     * @param numberOfGears
     */
    public Bicycle(double wheelDiameter, int numberOfGears)
    {
        // initialise instance variables
        this.pedalRpm = 0;
        this.gear = 1;
        this.wheelDiameter = wheelDiameter;
        this.numberOfGears = numberOfGears;
    }
    
    /**
     * Constructor for objects of class Bicycle
     */
    public Bicycle()
    {
        // initialise instance variables
        this.pedalRpm = 0;
        this.gear = 1;
        this.wheelDiameter = 0.5;
        this.numberOfGears = 3;
    }

     /**
     * gets the value of wheelDiamter
     * 
     * @return  wheel diameter
     */
    public double getWheelDiameter()
    {
        return this.wheelDiameter;
    }   
    
    /**
     * gets the value of numberOfGears
     * 
     * @return  number of gears
     */
    public int getNumberOfGears()
    {
        return this.numberOfGears;
    }   
  
    /**
     * gets the value of current gear
     * 
     * @return  current gear
     */
    public int getGear()
    {
        return this.gear;
    }   
    
    /**
     * gets the value of pedalRpm
     * 
     * @return  pedal rpm
     */
    public int getPedalRpm()
    {
        return this.pedalRpm;
    }
    
     /**
     * changes value of pedalRpm
     * 
     * @param  pedalRpm
     */
    public void setPedalRpm(int pedalRpm)
    {
        this.pedalRpm = pedalRpm;
        if (this.pedalRpm <=0) this.pedalRpm = 0;
    }
    
    /**
     * changes value of gear
     * 
     * @param  direction   0 for down, 1 for up, no change otherwise
     */
    public void changeGear(int direction)
    {
        if (direction == 0){
            this.gear--;
            if (this.gear <=1) this.gear = 1;
        }
        else if (direction ==1){
            this.gear++;  
            if (this.gear > numberOfGears) this.gear = numberOfGears;
        }
    }
    
    /**
     * calculates the road speed of the bicycle in meters per second
     * 
     */
    public double speed()
    {
        // speed is pedal RPM * wheel circumference /60 * gear
        double wheelCircumference = 3.14 * this.wheelDiameter;
        return this.pedalRpm * wheelCircumference / 60 * this.gear;
    }
}
