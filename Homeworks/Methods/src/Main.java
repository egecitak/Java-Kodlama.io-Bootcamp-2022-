
public class Main {

    public static void main(String[] args) {

        findNumber();
        findNumber();
        findNumber();
        findNumber();

    }

    public static void findNumber() {

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
            sendMessage("Target number (" + targetNumber + ") is in the array.");
        } else {
            sendMessage("Target number (" + targetNumber + ") isn't in the array.");
        }

    }

    public static void sendMessage(String message) {
        System.out.println(message);
    }
}