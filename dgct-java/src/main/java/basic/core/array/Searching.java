package basic.core.array;

import java.util.Scanner;

public class Searching {
    public int linearSearch(double[] arr, double user){
        for(int index=0;index<arr.length;index++){
            if(arr[index]==user)
                return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        double[] annualSalary = {9.7,2.5, 8.3, 6.1, 4.5, 7.2};
        Searching searching = new Searching();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to search ");
        double given = scanner.nextDouble();
        int result = searching.linearSearch(annualSalary, given);
        System.out.println(result);
        scanner.close();
    }
}
