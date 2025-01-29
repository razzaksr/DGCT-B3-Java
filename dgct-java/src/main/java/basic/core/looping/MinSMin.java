package basic.core.looping;

import java.util.Scanner;

public class MinSMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE, userGiven = 0;
        // find first and second min 
        for(int entry = 1;entry<=10;entry++){
            System.out.println("Enter the number ");
            userGiven = scanner.nextInt();
            if(userGiven<=firstMin){
                secondMin=firstMin;
                firstMin=userGiven;
            }
            if(userGiven<=secondMin&&userGiven!=firstMin){
                secondMin=userGiven;
            }
        }
        System.out.println("Amoung the 10 the following is First Minimum "
        +firstMin+" and SEcond Minimum is "+secondMin);
        scanner.close();
    }
}
