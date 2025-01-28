package basic.core;

public class TypeCasting {
    public static void main(String[] args) {
        // int myInitial = 'S';
        // System.out.println(myInitial);
        // char myBlock = 78;
        // System.out.println(myBlock);
        char myData1 = 'R', myData2 = 'S';
        myData1*=(char)(myData2);// myData1=(char)(myData1*myData2);
        myData2=(char)(myData1/myData2);
        myData1/=(char)(myData2);// myData1=(char)(myData1/myData2);
        System.out.println(myData1+" "+myData2);
    }
}
