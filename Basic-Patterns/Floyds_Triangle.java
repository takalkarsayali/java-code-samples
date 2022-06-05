/*
Printing following pattern:
n=5

    1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15

*/

import java.util.Scanner;

public class Floyds_Triangle {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("-----Floyd's Triangle-----");
    System.out.print("Enter the end of Floyd's Triangle: ");
    int n = sc.nextInt();
    int number = 1;
    //outer loop
    for(int i = 1; i <= n; i++){
        //inner loop
        for(int j=1; j<=i; j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println(); 
    }
    }
}
