import java.util.Scanner;

public class score_board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n0.Stop\n1.Continue\nEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Thank you! bye see ya!");
                break;
            case 1:
                System.out.print("Enter your aggregate score(outoff 100): ");
                int score = sc.nextInt();
                if(score > 100 || score < 0){
                    System.out.println("Please enter vaild marks..");
                }else if(score >= 90){
                    System.out.println("This is Good:)");
                }else if (score <= 89 & score >= 60) {
                    System.out.println("This is also good:)");
                } else {
                    System.out.println("This is good as well:)");
                }
                break;
            default:
                System.out.println("Please enter valid choice from menu");
        }
        
    }
}
