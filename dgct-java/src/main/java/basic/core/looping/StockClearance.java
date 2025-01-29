package basic.core.looping;

import java.util.Scanner;

public class StockClearance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ABC Mart Stock Clearance Sale .... ");
        int days = 1, stock = 100, required = 0; 

        for(;days<=5&&stock>0;days++){
            System.out.println("Let us know how many mobiles you want ");
            required = scanner.nextInt();
            if(required<=stock){
                stock-=required;
            }
        }
        System.out.println((days-1)+" days sale done stock "+stock);

        scanner.close();
    }
}
