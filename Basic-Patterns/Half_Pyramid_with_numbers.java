/*
Printing following pattern:
n=5

    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5

*/

import java.util.Scanner;

public class Half_Pyramid_with_numbers {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("-----Printing Half pyramid using Numbers-----");
        System.out.print("Enter the height of Pyramid: ");
        int n = sc.nextInt();
        //rows
        for (int i = 1; i <= n; i++){
            //columns
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
