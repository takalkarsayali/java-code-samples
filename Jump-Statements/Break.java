public class Break{
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                break;  //terminates loop if i is 5
            }
            System.out.println(i);
        }
        System.out.println("Loop terminated using break!!");
    }
}
