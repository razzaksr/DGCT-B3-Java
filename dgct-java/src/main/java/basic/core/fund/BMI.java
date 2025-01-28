package basic.core.fund;

public class BMI {
    public static void main(String[] args) {
        double weight=Double.parseDouble(args[0]);
        double height=Double.parseDouble(args[1]);
        // cm to m>> cm/100
        height/=100;// height=height/100;
        double bmi=weight/(height*height);
        System.out.println("Your BMI is "+bmi);
    }
}
