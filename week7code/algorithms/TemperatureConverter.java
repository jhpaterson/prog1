
/**
 * Provides conversions between different temparature scales
 * 
 * @author JP
 * @version 1.0
 */
public class TemperatureConverter
{
   /**
    * converts a temperature in degrees centigrade to fahrenheit
    * F = (C x 9/5) + 32
    * 
    * @param centigrade the temperature in degrees centigrade
    */
   public double centigradeToFahrenheit(double centigrade)
   {
       double fahrenheit = (centigrade * 9 / 5) + 32;
       return fahrenheit;
   }
   
   /**
    * converts a temperature in degrees fahrenheit to centigrade
    * C = (F - 32) * 5/9
    * 
    * @param fahrenheit the temperature in degrees fahrenheit
    */
   public double fahrenheitToCentigrade(double fahrenheit)
   {
       // TO DO: complete this method
       double centigrade = (fahrenheit - 32) * 5 / 9;
       return centigrade;
   }
}
