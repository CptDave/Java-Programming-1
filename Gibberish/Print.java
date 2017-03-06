import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Print {
    public static void main(String[] args) {
        StringWriter sW = new StringWriter();
        PrintWriter pW = new PrintWriter(sW);
        Scanner scnr = new Scanner(System.in);
        
        String str = "";
        System.out.print("Enter string(x to quit): ");
        str = scnr.next();
        while (!str.equals("x")) {
            pW.print(str + " ");
            System.out.print("Enter string(x to quit): ");
            str = scnr.next();
        }
        System.out.println(sW.toString());
        
    }
}