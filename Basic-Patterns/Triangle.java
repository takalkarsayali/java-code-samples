/*
Printing following pattern:
n=5

       *
      ***
     *****
    *******
   *********

*/

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("-----Triangle Display-----");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");              
            }
            //stars 1st half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //stars 2nd half
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
