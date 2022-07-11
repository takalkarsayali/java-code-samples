import java.util.Scanner;

public class PrintProduct{
    //function to calculate the product of 2 numbers
    public static int calculateProduct(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = sc.nextInt();
    int product = calculateProduct(a, b);
    System.out.println("Product = "+product);
    }
}