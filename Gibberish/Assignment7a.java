/*  Assignment7.java
    Monica Martinez
    2014-10-29
    CIS 111
    This program is a sequential text file that allows user to input information and stores it reads it and displays it.*/
	
 //you had Assignment7, not Assignment7a like the file name. They need to be the same.
public class Assignment7a extends CIS111App { 
    public static void main(String[] args) {
        
        int month, day, year;
        char record;
        double hours;
        String filename = "seqFile.txt";
        String departmentID, employeeID;
        
        //create and open file for writing
        SequentialFile fileout = new SequentialFile("seqFile.txt", FileMode.APPEND);
        

        // loop to get input from user and write to file
        //priming read
        
		
        String choice = getChar("Enter a record? (Y/N) " );
        // (loop)
		//should be while not if
        while (choice == equalsIgnoreCase("y")) {
            departmentID = getString("Enter dept ID: ");
            employeeID = getString("Employee ID: ");
            month = getInt("Enter month: ",1,12);
            day = getInt("Enter day: ",1,31);
            year = getInt("Enter year: ",2000,2100);
            hours = getDouble("Enter hours: ",0.0,24.0);
            fileout.writeln(departmentID.toUpperCase + " " + employeeID.toUpperCase + " " + month + " " + day + " " + hours);
            choice = getString("Enter another record?(Y/N): ", y, n);
            
            
 
        }

        // close output file
        fileout.close();
    }  
    
}


/*create an input loop to enter data
*stop input when the user chooses to end it
*validate user input
*write data to a sequential access text file with each record being one line

create a sequential access, variable-length record data file. 
You will create the user interface and store the data the user enters.
Each record in the file must have the following format:

Your task is to present a nice user interface for the user that will loop until the user chooses to stop entering data. 
Each time the user completes the data entry for a record, write it out to a file named seqfile.txt.
You should open the file for appending data to the end. 
Remember to delete the seqfile.txt file if you want to re-enter all the data for testing purposes. 
You must follow the sample input and output formats exactly and include error checking.
The error messages can have a different format/text.
All input should be converted to uppercase internally. 
The sample of what the contents of the file should look like when you enter the data from the sample run is shown at the end of this page.

Sample Run

>erase seqfile.txt

>java CreateSeqFile
Enter dept ID: IT
Employee ID:   D4772
Enter month:   1
Enter day:     2
Enter year:    2011
Enter hours:   8.25

Enter another record? (Y/N) y

Enter dept ID: IT
Employee ID:   F9642
Enter month:   1
Enter day:     4
Enter year:    2011
Enter hours:   8.25

Enter another record? (Y/N) n

File seqfile.txt has been modified.

>java CreateSeqFile
Enter dept ID: IT
Employee ID:   V1001
Enter month:   -9
Integer value must be between 1 and 12, please re-enter: 1
Enter day:     34
Integer value must be between 1 and 31, please re-enter: 3
Enter year:    08
Integer value must be between 2000 and 2100, please re-enter: 2011
Enter hours:   480
Double value must be between 0.0 and 24.0, please re-enter: 5.25

Enter another record? (Y/N) p
Error: Character entered is not a valid response.
Enter another record? (Y/N) Y

Enter dept ID: MGT
Employee ID:   A0010
Enter month:   1
Enter day:     2
Enter year:    2011
Enter hours:   6.5

Enter another record? (Y/N) N

File seqfile.txt has been modified.

>copy seqfile.txt con:
"IT","D4772",1,2,2011,8.25
"IT","F9642",1,4,2011,8.25
"IT","V1001",1,3,2011,5.25
"MGT","A0010",1,2,2011,6.5
        1 file(s) copied. */