/*
Printing following pattern:
n=5

            *
          * *
        * * *
      * * * *
    * * * * *

*/

import java.util.Scanner;

public class Half_pyramid_inv_rotated {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid: ");
        int n = sc.nextInt();

        // outer loop => row
        for (int i = 1; i <= n; i++) {
            // inner loop => space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // inner loop => *'s
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
