package basic.core.looping;

import java.util.Scanner;

public class Objective {
    public static void main(String[] args) {
        // determined loop, finite loop
        // count no of people not maintaining the minimum balance
        Scanner scanner = new Scanner(System.in);
        int count = 0, person = 100;// init
        double current = 0;// init
        do{
            System.out.println("let us know your current balance ");
            current=scanner.nextDouble();
            if(current<=2000){
                count++;
            }
            person--;// linear
        }while(person>=81);
        System.out.println("no of people "+count+" not maintaining min balance");
        scanner.close();
    }
}
