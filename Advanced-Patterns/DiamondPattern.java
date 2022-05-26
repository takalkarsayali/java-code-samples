import java.util.Scanner;

public class DiamondPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Diamond Pattern-----");
        System.out.print("n = ");
        int n = sc.nextInt();

        // upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // Stars
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // Stars
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}