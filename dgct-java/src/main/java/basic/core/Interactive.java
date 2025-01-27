package basic.core;

import java.util.Scanner;

/*
 * whole numbers:
 * short>> 2byte
 * int >> 4byte
 * long>> 8byte
 */

public class Interactive {
    public static void main(String[] args) {
        System.out.println("WElcome to Voter HelpLine");
        // Object Creation:
        // Classname objectName = new Classname();
        Scanner myScan = new Scanner(System.in);
        String applicantName="", district="", pan="";
        long contactNumber=0L;int age=0;
        System.out.println("Enter the name ");
        applicantName = myScan.next();// String
        System.out.println("Enter the district ");
        district = myScan.next();
        System.out.println("Enter the PAN ");
        pan = myScan.next();
        System.out.println("Enter the age ");
        age = myScan.nextInt();
        System.out.println("Enter the contact ");
        contactNumber = myScan.nextLong();
        System.out.println("Thanks for applying voter id "+ applicantName 
        +" and your tracking details will be sent to "+contactNumber);
    }
}
