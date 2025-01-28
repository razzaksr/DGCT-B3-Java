package basic.core;

public class IsPrime {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if(number==2||number==3||number==5||number==7||number%2!=0&&
        number%3!=0&&number%5!=0&&number%7!=0){
            System.out.println(number+" is prime");
        }
        else{
            System.out.println(number+" Is not prime ");
        }
    }
}
