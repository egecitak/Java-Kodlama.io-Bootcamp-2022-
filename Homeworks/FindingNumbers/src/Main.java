
public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 5, 7, 9, 0};
        int targetNumber = 7;
        boolean isThere = false;

        for (int i : numbers) {
            if (i == targetNumber) {
                isThere = true;
                break;
            }
        }

        if (isThere) {
            System.out.println("Target number is in the array.");
        } else {
            System.out.println("Target number isn't in the array.");
        }

    }
}