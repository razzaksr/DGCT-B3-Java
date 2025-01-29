package basic.core.looping;

import java.util.Scanner;

public class NonLinear {
    public static void main(String[] args) {
        // non linear bus ticket booking
        Scanner scanner = new Scanner(System.in);
        int required = 0, receipt=0;
        for(int seats=20;seats>=1;){
            System.out.println("Tell us how many seats required ");
            required = scanner.nextInt();
            if(required<=seats){
                seats-=required;// non linear
                receipt++;
            }
        }
        System.out.println(receipt+" bills");
        scanner.close();
    }
}
