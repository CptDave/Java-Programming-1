import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        String str = "";
        
        try {
            fin = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            System.exit(0);
        }
        
        Scanner scnr = new Scanner(fin);
        str = scnr.next();
        System.out.println(str);
        fin.close();
    }
}