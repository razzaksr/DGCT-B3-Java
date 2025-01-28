package basic.core.decision;

import java.util.Scanner;

public class MyWallet {
    public static void main(String[] args) {
        String receiverName="", userSelection="";
        int transactionAmount = 0; double availableBalance = 89000.56;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let us know what you wish to do ");
        userSelection = scanner.next();
        switch (userSelection) {
            case "deposit":
                System.out.println("let us know amount to deposit ");
                transactionAmount = scanner.nextInt();
                availableBalance+=transactionAmount;
                System.out.println(transactionAmount+" has deposited ");
                break;
            case "withdraw":
                System.out.println("let us know amount to withdraw ");
                transactionAmount = scanner.nextInt();
                if(transactionAmount<=availableBalance){
                    availableBalance-=transactionAmount;
                    System.out.println(transactionAmount+" has withdrawn successfully");
                }
                else{
                    System.out.println("Insufficient balance");
                }
                break;
            case "transfer":
                System.out.println("let us know amount to transfer ");
                transactionAmount = scanner.nextInt();
                System.out.println("let us know to whom you wish to transfer ");
                receiverName = scanner.next();
                if((transactionAmount+5)<=availableBalance){
                    availableBalance -= (transactionAmount+5);
                    System.out.println(transactionAmount+" has transferred to "+receiverName);
                }
                else{
                    System.out.println(transactionAmount+" insufficient to transfer "+receiverName);
                }
                break;
            default:
                System.out.println("available balance "+availableBalance);
                break;
        }
    }
}
