
public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = returnCity();
        System.out.println(newMessage);

        int number = sum(5, 7);
        System.out.println(number);

        int summedNumber = sum(2, 3, 4, 6, 10);
        System.out.println(summedNumber);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //variable argument count
    //can be called without parameters
    public static int sum(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static String returnCity() {
        return "Ankara";
    }
}