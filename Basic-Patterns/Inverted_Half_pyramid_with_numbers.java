import java.util.Scanner;

public class Inverted_Half_pyramid_with_numbers {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Printing Inverted Pyramid with numbers-----");
        System.out.print("Enter the height of Pyramid: ");
        int n = sc.nextInt();
        //rows
        for(int i = 1; i <= n; i++){
        // for(int i = n; i >= 1; i--){        =====> Alternative
            //columns
            for (int j = 1; j <= n-i+1; j++) {
            // for (int j = 1; j <= i; j++) {        =====> Alternative
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
