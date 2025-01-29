package basic.core.looping;

import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        int[] denom = {100,200,500};
        int required = 0;
        // classname object = new Classname();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired amount ");
        required = scanner.nextInt();
        int index = denom.length-1;
        int count = 0;
        while(required>0&&index>=0){
            if(required>=denom[index]){
                required-=denom[index];
                count++;
            }
            else
                index--;
        }
        if(required==0)
            System.out.println(count+" is no of currency");
        else
            System.out.println("Unable to dispense");
        scanner.close();
    }
}
