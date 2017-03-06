import java.util.Scanner;

public class Test2 {
   public static void main (String [] args) {
      String simonPattern = "";
      String userPattern = "";
      int userScore = 0;
      int i = 0;

      userScore = 0;
      simonPattern = "RRGBRYYBGY";
      userPattern  = "RRGBBRYBGY";

      /* Your solution goes here  */
      for (i = 0; i <= 9; i++) {
         if (userPattern.charAt(i) == simonPattern.charAt(i)) {
            userScore++;
         } else {
          break;  
         }
      }

      System.out.println("userScore: " + userScore);

      return;
   }
}