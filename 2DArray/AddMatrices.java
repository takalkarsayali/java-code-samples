/*
 * Write a Java Program to perform the addition of two matrices and set Diagonal elements to 0.  
*/

public class AddMatrices {
    public static void main(String[] args) {
        int a[][] = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 },
        };
        int b[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                if (i == j) { // setting diagonal elements at 0
                    c[i][j] = 0;
                }
            }
        }
        // displaying resultant matrix
        System.out.println("\nResultant matrix is...");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
