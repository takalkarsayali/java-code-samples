import java.util.Scanner;

public class Tables {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Table of "+ n);
        int ans = n;
        for (int i = 1; i <= 20; i++){
            ans = n * i;
            System.out.println(n + " * "+ i+ " = " + ans);
        }
    }
}
