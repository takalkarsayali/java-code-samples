/*
Printing following pattern:
n=5

    * * * * * 
    *       * 
    *       * 
    * * * * *

*/

import java.util.Scanner;
public class Hollow_Rectangel {
    public static void main (String args[]){
        System.out.println("---Printing Hollow Rectangle---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        //outer loop for traversing through row
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if (i == 1 || j == 1 || i == r || j == c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
