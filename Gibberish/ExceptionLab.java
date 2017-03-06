/*
    ExceptionLab.java
    David Wartenbe
    CIS 160
    11/23/2016 
    
    Demonstrates use of exception handling
*/

import java.util.Scanner;
import java.lang.NumberFormatException;

public class ExceptionLab {
    private static Scanner kbd = new Scanner(System.in);
    
    public static void main(String[] args) {
        int intNum = getInt("Enter an integer: ", 27, 52);
        double dblNum = getDouble("Enter a number: ", -52.0, 12.5);
    }
    
    private static int getInt(String prompt, int min, int max) {
        boolean loop = true;
        String str;
        int integer = 0;
        
        while (loop) {
            System.out.print(prompt);
            str = kbd.nextLine();
            try {
                integer = Integer.parseInt(str);
                if (integer < min) System.out.println("Error: Number below minimum value");
                else if (integer > max) System.out.println("Error: Number above maximum value");
                else if (integer >= min && integer <= max) loop = false;
            } catch(NumberFormatException e) {
                System.out.println("Error: Number is invalid");
            }
        }
        return integer;
    }

    private static double getDouble(String prompt, double min, double max) {
        boolean loop = true;
        String str;
        double dbl = 0;
        
        while (loop) {
            System.out.print(prompt);
            str = kbd.nextLine();
            try {
                dbl = Double.parseDouble(str);
                if (dbl < min) System.out.println("Error: Number below minimum value");
                else if (dbl > max) System.out.println("Error: Number above maximum value");
                else if (dbl >= min && dbl <= max) loop = false;
            } catch(NumberFormatException e) {
                System.out.println("Error: Number is invalid");
            }
        }
        return dbl;
    }
}