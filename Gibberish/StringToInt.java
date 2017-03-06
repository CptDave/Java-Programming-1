/*
    LabArrays.java
    Name: David Wartenbe
    CIS 160
    Date: 11/8/2016
    
    Inclass Lab 8 Character and String Functions.
*/

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        int[] num = new int[1];
        String strNum;
        boolean valid = false;
        Scanner kbd = new Scanner(System.in);
        
        while (!valid) {
            System.out.print("Enter an integer: ");
            strNum = kbd.nextLine();
            valid = tryParse(strNum, num);
            if (!valid) System.out.println("Invalid integer.");
        }
        
        // Now that num has a value output a message to the user,
        // tell them what their number is and then output the number 
        // squared and then cubed.
        
        System.out.print("Number: " + num[0] + ", ");
        System.out.printf("Squared = %.0f, ",  Math.pow(num[0] * 1.0, 2.0));
        System.out.printf("Cubed = %.0f",  Math.pow(num[0] * 1.0, 3.0));
    }
    
    // Put your definition of tryParse() here
    private static boolean tryParse(String str, int[] num) {
        int index;
        boolean allDigits = true;
        int length = str.length();
    
        for (index = 0; index<length; index++) {
            if (!Character.isDigit(str.charAt(index))) {
                allDigits = false;
                break;
            }
        }
        if (allDigits) num[0] = Integer.parseInt(str);
        return allDigits;
    }
}
