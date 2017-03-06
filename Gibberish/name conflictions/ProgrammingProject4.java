/*
    ProgrammingProject4.java
    CIS 160
    David Wartenbe
    Programming Project 4
    11/5/2016
    
    This program reads in data from the user to create Records. Those Recored are then writtin to a file.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class ProgrammingProject4 {
    public static void main(String[] args) {
        Record record = null;
        FileWriter fWriter = null;
        ArrayList<Record> recordArray = new ArrayList<Record>();
        Scanner scnr = new Scanner(System.in);
        String choice = "Y";
        
        //collect data to store in Record
        while (choice.equals("Y")) {
            record = new Record(getRecordInput(new Record()));
            recordArray.add(record);
            System.out.print("\nEnter another record? (y/n) ");
            choice = scnr.next().toUpperCase();
            while (!choice.equals("Y") && !choice.equals("N")) {//while !y and !n show error
                System.out.println("Error: Character entered is not a valid response.");
                System.out.print("\nEnter another record? (y/n) ");
                choice = scnr.next().toUpperCase();
            }
        }

        //write data to file
        try {
            fWriter = new FileWriter("seqFile.txt", true);
            for (Record r : recordArray) {
                fWriter.append(r.getDeptId() + "\r\n");
                fWriter.append(r.getEmployeeId() + "\r\n");
                fWriter.append(r.getMonth() + "\r\n");
                fWriter.append(r.getDay() + "\r\n");
                fWriter.append(r.getYear() + "\r\n");
                fWriter.append(r.getHours() + "\r\n");
            }
            fWriter.close();
            System.out.println("\nFile seqFile.txt has been modified.");
        } catch(IOException e) {
            System.out.println("IO Exception Error.");
            System.exit(0);
        };
    }
    
    public static String getString() {
        Scanner scnr = new Scanner(System.in);
        String s = scnr.nextLine().toUpperCase();
        return s;
    }
    
    //validate and return integer value
    public static int getInt(int min, int max) {
        Scanner scnr = new Scanner(System.in);
        int i = scnr.nextInt();
        while (i < min || i > max) {
            System.out.print("Integer value must be between " + min + " and " + max + ", please re-enter:");
            i = scnr.nextInt();
        }
        return i;
    }
    
    //validate and return double value
    public static double getDouble(double min, double max) {
        Scanner scnr = new Scanner(System.in);
        double d = scnr.nextDouble();
        while (d < min || d > max) {
            System.out.print("Double value must be between " + min + " and " + max + ", please re-enter:");
            d = scnr.nextDouble();
        }
        return d;
    }
    
    //initialize a Record variable with user entered data
    public static Record getRecordInput(Record r) {
        System.out.print("Enter dept ID: ");
        r.setDeptId(getString());
        
        System.out.print("Employee ID: ");
        r.setEmployeeId(getString());
        
        System.out.print("Enter month: ");
        r.setMonth(getInt(1, 12));
        
        System.out.print("Enter day: ");
        r.setDay(getInt(1, 31));
        
        System.out.print("Enter year: ");
        r.setYear(getInt(2000, 2100));
        
        System.out.print("Enter hours: ");
        r.setHours(getDouble(0.0, 24.0));
        
        return r;
    }
}

class Record {
    private String deptId, employeeId;
    private int month, day, year;
    private double hours;
    
    //contructors
    public Record() {
        //this(new Record());
    }
    
    public Record(Record r) {
        deptId = r.getDeptId();
        employeeId = r.getEmployeeId();
        month = r.getMonth();
        day = r.getDay();
        year = r.getYear();
        hours = r.getHours();
    }
    
    public void setDeptId(String s) {
        deptId = s;
    }
    
    public void setEmployeeId(String s) {
        employeeId = s;
    }
    
    public void setMonth(int i) {
        month = i;
    }
    
    public void setDay(int i) {
        day = i;
    }
    
    public void setYear(int i) {
        year = i;
    }
    
    public void setHours(double d) {
        hours = d;
    }
    
    public String getDeptId() {
        return deptId;
    }
    
    public String getEmployeeId() {
        return employeeId;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getHours() {
        return hours;
    }
}


