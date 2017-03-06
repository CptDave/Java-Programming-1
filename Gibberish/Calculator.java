import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	  Scanner scnr = new Scanner(System.in);
      final double HOMEWORK_MAX = 80.0;
      final double MIDTERM_MAX  = 40.0;
      final double FINAL_MAX    = 70.0;
      final double HOMEWORK_WEIGHT = 0.20; // 20%
      final double MIDTERM_WEIGHT  = 0.30;
      final double FINAL_WEIGHT    = 0.50;

      double homeworkScore    = 0.0;
      double midtermScore     = 0.0;
      double finalScore       = 0.0;
      double coursePercentage = 0.0;
	  
	  System.out.println("Enter homework score: ");
	  homeworkScore = scnr.nextDouble();
	  
	  System.out.println("Enter midterm exam score:");
      midtermScore = scnr.nextDouble();

      System.out.println("Enter final exam score:");
      finalScore = scnr.nextDouble();

      coursePercentage = (((homeworkScore / HOMEWORK_MAX) * HOMEWORK_WEIGHT) 
					+ ((midtermScore / MIDTERM_MAX) * MIDTERM_WEIGHT) 
					+ ((finalScore / FINAL_MAX) * FINAL_WEIGHT));
                 
                       
      coursePercentage = coursePercentage * 100.0; // Convert fraction to %

      System.out.print("Your course percentage: ");
      System.out.println((int) coursePercentage + "%");
	  
	  return;
	}
}