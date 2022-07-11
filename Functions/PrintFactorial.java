import java.util.Scanner;

public class PrintFactorial {
    public static void calculateFactorial(int num) {
        if (num < 0) {
            System.out.println("Their is no Factorial for negative numbers");
            return;
        }
        int fact = 1;
        // for(int i = num; i>=1; i--)
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(num + "! " + " = " + fact);

        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate Factorial: ");
        int num = sc.nextInt();
        calculateFactorial(num);
    }
}
