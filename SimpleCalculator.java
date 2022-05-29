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
                System.out.print("Addition => "+ (num1 + num2));
                break;
            case 2: 
                System.out.print("Subtraction => " + (num1 - num2));
                break;
            case 3: 
                System.out.print("Multiplication => "+ (num1 * num2));
                break;
            case 4: 
            if(num2 == 0){
                System.out.println("Invalid Division");
            }else{
                System.out.println("Division => "+ (num1 / num2));
            }
            break;
            case 5: 
            if(num2 == 0){
                System.out.println("Invalid Division");
            }else{
                System.out.println("Division => "+ (num1 % num2));
            }
            break;
            }
    }
}
