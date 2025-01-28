package basic.core.decision;

import java.util.Scanner;

public class PaymentTransfer {
    public static void main(String[] args) {
        double available = 7890.8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to transfer ");
        double payable = scanner.nextDouble();
        if(payable>=1&&available>=payable){
            if(payable>=50000){
                System.out.println("RTGS");
            }
            else{
                System.out.println("NEFT, IMPS");
            }
        }
        else{
            System.out.println("Invalid amount to transfer");
        }
    }
}
