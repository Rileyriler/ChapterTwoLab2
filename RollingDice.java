
// **************************************************
//   RollingDice.java
//
//   To generate two random "lucky" numbers
// **************************************************
 
import java.util.Random;
 
public class RollingDice
{  
   public static void main (String[] args)
   {
          Random generator = new Random();
          int roll1, roll2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
 
          roll1 = Math.abs(generator.nextInt()) % 6;
 
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
 
          roll2 = (int) (generator.nextFloat() * 7);
 
          System.out.println ("Your rolls are " + roll1 + " and " + roll2);
        }
}

