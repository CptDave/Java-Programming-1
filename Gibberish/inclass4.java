/*
    LabRepetition.cpp
    Name: 
    CIS 160
    Date: 
    
    CIS 160 Chapter 5 Repetition Lab
*/

/*
    Place your name and section at the top in comments.
    Read the instructions for each section and then implement
    your solution within this program.

    You may comment out sections as you work. Declare variables
    if necessary. You do not need to get input from the user
    unless otherwise specified or that code is already written.
*/

import java.util.Scanner;

public class inclass4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.println("Part I (while loop)");
        /* Part 1. Write a while loop that will output the square
           roots of the numbers from 10 to 20, each on it's own line.
        */
		int num1 = 10;
		while (num1 <= 20) {
			System.out.println(Math.sqrt(num1));
			num1++;
		}

        System.out.println("Part II (do-while loop)");
        /* Part 2. Write a do-while loop that will output the square
           roots of the numbers from 10 to 20, each on it's own line.
        */
		num1 = 10;
		do {
			System.out.println(Math.sqrt(num1));
			num1++;
		} while (num1 <= 20);

        System.out.println("Part III (for loop)");
        /* Part 3. Write a for loop that will output the square
           roots of the numbers from 10 to 20, each on it's own line.
        */
		for (num1 = 10; num1 <= 20; num1++) {
			System.out.println(Math.sqrt(num1));
		}

        System.out.println("Part IV (input validation)");
        num1 = -1;
        // Part 4. Write a while loop around the following code that will
        // validate that a user entered value is within the range 1 through 100
        //by looping until the number the user entered is within that range.
        
		while (num1 < 1 || num1 > 100) {
           System.out.print("Enter a number between 1 and 100: ");
           num1 = in.nextInt();
		}
        
		

        System.out.println("Part V (40 column table)");
        /* Part 5. Using ONE while or for loop, output the numbers from 1 to
           100. Each number should be in a field four characters wide and only
           ten numbers should display on a line. You will have to choose some
           way to output a newline after every tenth number.
           There are several different ways to count! 
             a. Create a counter variable. Add one to it each time you
                output an number. Using a decision structure, if you
                reach 10 output a newline and start your count over.
             or
             b. 
           Your output should look similar to thisIn a decision structure, use modulus to see if you have
                reached a number evenly divisible by 10

             1   2   3   4   5   6   7   8   9  10
            11  12  13  14  15  16  17  18  19  20 
            21  22  23  24  25  26  27  28  29  30
            31  32  33  34  35  36  37  38  39  40
            41  42  43  44  45  46  47  48  49  50
            51  52  53  54  55  56  57  58  59  60
            61  62  63  64  65  66  67  68  69  70
            71  72  73  74  75  76  77  78  79  80
            81  82  83  84  85  86  87  88  89  90
            91  92  93  94  95  96  97  98  99 100
        */
		int count = 1;
		for (num1 = 1; num1 <= 10; num1++) {
			for (int num2 = 1; num2 <= 10; num2++) {
				System.out.printf("%3d  ", count);
				count++;
				if (num2 == 10) System.out.println();
			}
		}
    }
}