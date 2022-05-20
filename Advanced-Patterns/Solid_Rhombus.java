import java.util.Scanner;

public class Solid_Rhombus {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Solid Rhombus-----");
        System.out.print("Height of Rhombus = ");
        int n = sc.nextInt();
        System.out.println();
        
        for (int i = 1; i <= n; i++){
            //spaces
            int spaces = n-i;
            for(int j=1; j <= spaces; j++){
                System.out.print("  ");
            }
            for(int m = 1; m <= n; m++){
            System.out.print("* ");
        }
            System.out.println();
        }
        System.out.println();
    }
}

