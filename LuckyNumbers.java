
// **************************************************
//   LuckyNumbers.java
//
//   To generate two random "lucky" numbers
// **************************************************
 
import java.util.Random;
 
public class LuckyNumbers
{
   Random generator = new Random();
   
   public static void main (String[] args)
   {
          Random generator = new Random();
          int lucky1, lucky2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
 
          lucky1 = Math.abs(generator.nextInt()) % 70;
 
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
 
          lucky2 = (int) (generator.nextFloat() * 21 + 11);
 
          System.out.println ("Your lucky numbers are " + lucky1 + " and " + lucky2);
        }
}

