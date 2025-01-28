package basic.core.fund;

public class TypeParsing {
    public static void main(String[] args) {
        String myContact = "876567876787";
        Long mobile = Long.parseLong(myContact);
        System.out.println(mobile.getClass()+" "+mobile);
        // Double mobile = Double.parseDouble(myContact);
        // System.out.println(mobile);
        
    }
}
