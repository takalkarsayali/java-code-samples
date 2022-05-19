import java.util.*;
public class Solid_Rectangle {
    public static void main (String[] args){
        System.out.println("---Printing Solid Rectangle---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows to print: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns to print: ");
        int c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
}
