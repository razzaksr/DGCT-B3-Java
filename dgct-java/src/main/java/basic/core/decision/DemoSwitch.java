package basic.core.decision;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the destination ");
        String destination = scanner.next();
        switch (destination) {
            case "chennai":case "villupuram":case "chengalpet":case "tambaram":case "tindivanam":
                System.out.println("Your boarding time is 12.05am");
                break;
            case "hyderabad":case "katpadi":case "bengaluru":case "nellore":
                System.out.println("Your boarding time is 22.50pm");
                break;
            default:
                System.out.println("Invalid destination");
                break;
        }
    }
}
