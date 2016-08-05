package conversionfx;

/**
 * Provides conversions between different temperature scales
 * This is the model class for this program
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
    * @return the temperature in degrees fahrenheit
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
    * @return the temperature in degrees centigrade
    */
   public double fahrenheitToCentigrade(double fahrenheit)
   {
       double centigrade = (fahrenheit - 32) * 5 / 9;
       return centigrade;
   }
}
