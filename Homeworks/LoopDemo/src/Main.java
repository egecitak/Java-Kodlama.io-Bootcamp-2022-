public class Main {

    public static void main(String[] args) {

        //for
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For loop ended.");

        //while
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While loop ended.");

        //do-while
        i = 20;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("Do-While loop ended.");
    }
}