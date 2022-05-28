import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
    
        System.out.print("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulo\nEnter your choice number: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: 
                System.out.print("Addition => ");
                System.out.println(num1 + num2);
                break;
            case 2: 
                System.out.print("Subtraction => ");
                System.out.println(num1 - num2);
                break;
            case 3: 
                System.out.print("Multiplication => ");
                System.out.println(num1 * num2);
                break;
            case 4: 
                System.out.print("Division => ");
                System.out.println(num1 / num2);
                break;
            case 5: 
                System.out.print("Modulo => ");
                System.out.println(num1 % num2);
                break;
            }
    }
}
