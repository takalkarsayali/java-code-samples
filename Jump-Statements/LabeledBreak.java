public class LabeledBreak {
    public static void main(String[] args) {
        int i = 5;
        first:{
            second:{
                third:{
                    System.out.println("Before the break");
                    if(i == 5)
                    break second;
                    System.out.println("Inside third Block");
                }
                System.out.println("Inside second Block");
            }
            System.out.println("Inside first Block");
        }
    }
}
