/*
    LabArrays.java
    Name: David Wartenbe
    CIS 160
    Date: 11/2/2016
    
    CIS 160 Chapter 8 Arrays Lab
*/

public class LabArrays {
    public static void main(String[] args) {
        //1
        int[] iNumbers = new int[5];
        //2
        int[] iValues = {2,4,6,8,10};
        //3
        float[] flValues = {1.1f, 3.3f, 5.7f};
        //4
        System.out.println(iValues[2]);
        //5
        System.out.println(flValues[0]);
        //6
        iValues[4] = 12;
        //7
        flValues[1] = 7.0f;
        //8
        int index;
        //10
        index = 2;
        System.out.println(iValues[index]);
        //11
        index = 0;
        while (index < iValues.length) {
            System.out.println(iValues[index]);
            index++;
        }
        //13
        displayArray(iNumbers);
    }
    //12
    public static void displayArray(int[] ary) {
        for (int i=0; i<ary.length; i++) {
            System.out.println(ary[i]);
        }
    }
}

