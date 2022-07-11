public class LabeledContinue {
    public static void main(String[] args) {
        Label1:
        for (int i = 0; i < 11; i++) {
            if(i%2 == 0){
                System.out.println("Even Value: = "+i);
                continue Label1;
            }System.out.println("Odd value: = "+i);
        }
    }
}
