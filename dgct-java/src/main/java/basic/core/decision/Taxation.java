package basic.core.decision;

import java.util.Scanner;

public class Taxation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your annual salary ");
        double annual = scanner.nextDouble();
        if(annual<=3){
            System.out.println("No tax deduction");
        }
        else if(annual>3&&annual<=5){
            annual-=(annual*0.050);
            System.out.println("5 percent tax deduction");
        }
        else if(annual>5&&annual<=10){
            annual-=(annual*0.100);
            System.out.println("10 percent tax deduction");
        }
        else if(annual>10&&annual<=15){
            annual-=(annual*0.200);
            System.out.println("20 percent tax deduction");
        }
        else if(annual>15&&annual<30){
            annual-=(annual*0.250);
            System.out.println("25 percent tax deduction");
        }
        else{
            annual-=(annual*0.300);
            System.out.println("30 percent tax deduction");
        }
        System.out.println("Your take home "+annual);
    }
}
