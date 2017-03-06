/*
    ProgrammingProject5.java
    CIS 160
    David Wartenbe
    Programming Project 5
    11/12/2016
    
    This program accepts integer value from user, fills array with random integers, calculates the total and average
*/

public class ProgrammingProject5 {
    public static void main(String[] args) {
        int index;
        int arraySize = 0;
        int[] intArray;
    
        //If no arguments entered, exit program
        if (args.length == 0) {
            System.out.println("No arguments entered");
            System.exit(1);
        }
        
        //convert string to int
        try {
            arraySize = Integer.parseInt(args[0]);
            if (arraySize < 1) {
                System.out.println("Error: Values entered too small");
                System.exit(1);
            }
        } catch(NumberFormatException e) {
            System.out.println("Error: Can not convert to integer value");
            System.exit(1);
        };

        intArray = new int[arraySize];
        
        fillArray(intArray);
        
        displayArray(intArray);
    }
    
    private static double returnTotal(int[] ar) {
        double total = 0;
        for (int i=0; i<ar.length; i++) total += ar[i];
        return total;
    }
    
    private static void fillArray(int[] ar) {
        java.util.Random rand = new java.util.Random();
        
        for (int i=0; i<ar.length; i++) {
            ar[i] = rand.nextInt(100) + 1;
        }
    }
    
    private static void displayArray(int[] ar) {
        for (int i=0; i<ar.length; i++) {
            if (i>0 && i%10==0) System.out.println();
            System.out.printf("%4d", ar[i]);
        }
        System.out.printf("%nThe total: %4.0f%n", returnTotal(ar));
        System.out.printf("The Average: %4.2f", returnTotal(ar) / ar.length);
    }
}