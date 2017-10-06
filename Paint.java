
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length = 15;
            int width = 11;
            int height = 8;
            //declare double totalSqFt;
            double totalSqFt = (2*(length * width)) + (2*(length * height)) + (2*(height * width));            //declare double paintNeeded;
 
            //Declare and initialize the length of the room
            
            //Declare and initialize the width of the room
 
            //Declare and initialize the height of the room
 
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
 
            //Compute the amount of paint needed
            double paintNeeded = totalSqFt / COVERAGE;
            //Print the length, width, and height of the room and the
            System.out.println("length: " + length);
            System.out.println("width: " + width);
            System.out.println("height: " + height);
            //number of gallons of paint need
            System.out.println("Gallons of paint needed: " + paintNeeded);
            //With doors or windows
            int doorsSqFt = 20;
            int windowsSqFt = 15;
            totalSqFt = totalSqFt - doorsSqFt - windowsSqFt;
            paintNeeded = totalSqFt / COVERAGE;
            System.out.println("Gallons of paint if there are windows and doors: " + paintNeeded);
        }
}
 