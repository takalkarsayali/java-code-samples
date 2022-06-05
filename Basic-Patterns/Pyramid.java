/*
Pyramid: 
n=6
             * 
            * * 
           * * * 
          * * * * 
         * * * * * 
        * * * * * * 
*/
import java.util.Scanner;

public class Pyramid {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height of Pyramid: ");
		int n = sc.nextInt();

		// Outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop for space
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// inner loop for stars
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
