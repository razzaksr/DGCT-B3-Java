package basic.core.array;

public class Sorting {
    public void selection(double[] arr){
        for(int select = 0;select<arr.length;select++){
            for(int compare=select+1;compare<arr.length;compare++){
                // swap
                if(arr[select]>arr[compare]){
                    arr[select]*=arr[compare];
                    arr[compare]=arr[select]/arr[compare];
                    arr[select]/=arr[compare];
                }
            }
        }
    }
    public static void main(String[] args) {
        double[] annualSalary = {9.7,2.5, 8.3, 6.1, 4.5, 7.2};
        // for(type temp:source)
        for(double each:annualSalary){
            System.out.print(each+" ");
        }
        System.out.println();
        Sorting sorting = new Sorting();
        sorting.selection(annualSalary);
        for(double each:annualSalary){
            System.out.print(each+" ");
        }
        System.out.println();
    }
}
