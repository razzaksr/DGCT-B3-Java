package basic.core.looping;

import java.util.Scanner;

public class BusBay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int required = 0;

        for(int bus=1;bus<=4;bus++){
            // cuurent bus is 
            System.out.println("current bus "+bus);
            for(int seat = 50, timing=10;seat > 0&&timing>0; timing--){
                System.out.println("Enter required seats ");
                required = scanner.nextInt();
                if(required<=seat){
                    seat-=required;
                }
            }
        }

        scanner.close();
    }
}
