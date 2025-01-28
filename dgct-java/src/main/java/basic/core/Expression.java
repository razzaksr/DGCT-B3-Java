package basic.core;

public class Expression {
    public static void main(String[] args) {
        short alpha = 25, cosmo=91;
        // System.out.println(alpha++ +" "+alpha);
        // System.out.println(alpha-- +" "+alpha);
        // System.out.println((alpha*=2)+(--cosmo)-(cosmo/=2));
        System.out.println((cosmo--)-(alpha+=5)/(++alpha));
        
    }
}
