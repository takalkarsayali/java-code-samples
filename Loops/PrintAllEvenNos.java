import java.util.Scanner;

public class PrintAllEvenNos {
    public static void main(String args[]){
        //printing all even numbers till n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
