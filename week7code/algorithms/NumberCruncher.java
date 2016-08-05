import java.util.Scanner;

/**
 * Provides some useful calculations on lists of numbers
 * 
 * @author JP
 * @version 1.0
 */
public class NumberCruncher
{
    Scanner input;
    
    /**
     * default constructor for objects of type NumberCruncher
     * 
     */
    public NumberCruncher()
    {
        this.input = new Scanner(System.in);
    }
        
    /**
     * finds the maximum value within a list of integers
     * 
     * @param listSize number of integers in the list to be processed
     */
    public int maximum(int listSize)
    {
        int max = 0;
        for(int i=0; i<listSize; i++)
        {
            System.out.print("Next number >");
            int nextNumber = input.nextInt();
            if (nextNumber > max)
            {
                max = nextNumber;
            }
        }
        return max;
    }
    
    
    /**
     * finds the maximum value within an array of integers
     * 
     * @param numbers the array to be processed
     */
    public int maximum(int[] numbers)
    {
        int max = 0;
        for(int i=0; i<numbers.length; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        return max;
    }
    

    /**
     * calculates the average (mean) of a list of integers
     * 
     * @param listSize number of integers in the list to be processed
     */
    public double average(int listSize)
    {
        double total = 0;
        for(int i=0; i<listSize; i++)
        {
            System.out.print("Next number >");
            String nextInput = input.nextLine();
            int nextNumber = Integer.parseInt(nextInput);
            total += nextNumber;
        }
        double average = total / listSize;
        return average;
    }
    
    
    /**
     * calculates the average (mean) of an array of integers
     * 
     * @param numbers the array to be processed
     */
    public double average(int[] numbers)
    {
        double total = 0;
        for(int i=0; i<numbers.length; i++)
        {
            total += numbers[i];
        }
        double average = total / numbers.length;
        return average;
    }

}
