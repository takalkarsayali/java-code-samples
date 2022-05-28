import java.util.*;

public class sum_of_n_natural_nos {
    public static void main(String[] args) {
        System.out.println("-----Printing Sum of 'n' Natural numbers-----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first "+n+" Natural Numbers -> "+sum);
    }
}
