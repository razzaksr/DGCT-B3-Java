package basic.core.looping;

import java.util.Scanner;

public class FindNoOfDebits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentValue=0, available = 5000, count = 0;
        for(int entry = 1;entry<=10;entry++){
            System.out.println("Enter the current balance ");
            currentValue = scanner.nextInt();
            if(currentValue<available){
                count++;
            }
            available=currentValue;
        }
        System.out.println("No of debits "+count);
        count-=3;
        if(count>0){
            available-=(count*20);
        }
        System.out.println("available balance "+available);
        scanner.close();
    }
}
