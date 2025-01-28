package basic.core.decision;

import java.util.Scanner;

public class BmiReport {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your weight ");
        double weight = myScan.nextDouble();
        System.out.println("Enter your height ");
        double height = myScan.nextDouble();
        height/=100;// cm to m
        double bmi = weight/(height*height);
        System.out.println("Your BMI "+bmi);
        if(bmi<=24.1){
            System.out.println("Underweight eat 2000cal/day");
        }
        else if(bmi>=24.2&&bmi<=25.5){
            System.out.println("You are doing great");
        }
        else if(bmi>=25.6&&bmi<=30.1){
            System.out.println("Include rich protien and do moderate excersice");
        }
        else{
            System.out.println("You are obese, Do Cardio 1000cal/day include protein rich foods");
        }
    }
}
