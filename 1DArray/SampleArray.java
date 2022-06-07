/*
 * syntax of array declaration
   - data_type array_name[size] = new data_type[size]
*/

public class SampleArray {
    public static void main(String[] args) {
        int a[] = new int [5];
        System.out.println("\nStoring the numbers in array:");
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println("The element at 5th place is: "+a[4]);
    }
}
