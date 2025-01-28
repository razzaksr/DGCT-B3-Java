package basic.core.fund;

public class CommandLineArgument {
    public static void main(String[] ece) {
        // loan emi calculation: principle, roi, tenure 
        int principleAmount=Integer.parseInt(ece[0]);
        float rateOfIntrest=Float.parseFloat(ece[1]);
        int tenure = Integer.parseInt(ece[2]);
        double totalRepayment = principleAmount+(principleAmount*rateOfIntrest)/100;
        System.out.println("Total amount payable "+totalRepayment);
        double emi = totalRepayment/tenure;
        System.out.println(emi+" is monthly repayment amount");
    }
}
