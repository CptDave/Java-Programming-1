/*
    LabMethods.java
    Name: 
    CIS 150
    Date: 
    
    CIS 150 Chapter 6 Methods Lab
*/

/*
    Place your name and section at the top in comments.
    Read the instructions for each section and then implement
    your solution within this program.

    You can comment out sections as you work. Declare variables
    if necessary. You do not need to get input from the user
    unless otherwise specified or that code is already written.

    For this lab you will use the code in the file and 
    break it into methods. Code for methods has been marked
    for you. To do this you will:

    1. Cut the code from main(String[]) and paste
       it below the closing } for main. 

    2. Declare the local variables in the method.

    3. In main(String[]), determine which variable declarations need to remain there
       and which variables should be isolated to the various methods.

    4. Call the methods, passing values as needed and using assignment
       statements for any values returned from the methods.

    5. Run and debug your program. 

    6. When the program is running correctly, upload the completed file to 
        D2L.
*/

import java.util.Scanner;

/*******************************main line*******************************/
public class LabMethods {
    public static void main(String[] args) {
        float miles, gallons, mpg, time;
        
        
        /* The following do-while loop should become a method to get
           and validate input from the user. The method should take three 
           parameters: a prompt, a minimum value, and a maximum value. The
           minimum and maximum values in the loop below are the values 1 and
           600. Use the function to get a value for miles. */
        
        miles = getInput("miles", 1, 600);

        /* Reuse the method you created for the previous input validation to
           get the value for gallons. The same method should work for both. */
   
        gallons = getInput("gallons", 1, 50);

        /* The following should become one method to calculate the mpg. */
        mpg = getMiles(miles, gallons);

        /* The following should become one method to calculate the time
          (in hours) to drive the given miles going 60 miles per hour. */
        time  = miles / 60;

        /* The following should become one method to display the mileage
           information to the user*/
        printInfo(miles, gallons, mpg, time);
    }

    /*************************method definititions**************************/
    
    public static float getInput(String str, float min, float max) {
        float x;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.print("Enter the " + str + " driven: ");
            x = kbd.nextFloat();
            if (x < min || x > max) {
                System.out.println("Error: the value must be between" + min + " and " + max + " inclusive");
            }
        } while (x < min || x > max);
        return x;
    }
    
    public static float getMiles(float miles, float gallons) {
        return miles / gallons;
    }
    
    public static void printInfo(float m, float g, float mpg, float t) {
        
        System.out.println("Your mileage specs are");
        System.out.printf("Miles:   %8.1f%n", m);
        System.out.printf("Gallons: %8.1f%n", g);
        System.out.printf("MPG:     %8.1f%n", mpg);
        System.out.printf("Time:    %8.1f%n", t);
    }
}