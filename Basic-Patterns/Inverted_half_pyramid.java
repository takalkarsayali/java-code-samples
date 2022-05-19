import java.util.*;
public class Inverted_half_pyramid {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Printing Inverted half pyramid-----");   
        System.out.print("Enter the height of pyramid: ");
        int n = sc.nextInt();

        // outer Loop => row
        for(int i = n; i >= 1; i--){
            //inner loop => column
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        System.out.println(); 
        }

    }
    
    
}
