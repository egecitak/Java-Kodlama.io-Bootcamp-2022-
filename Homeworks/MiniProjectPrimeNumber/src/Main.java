public class Main {

    public static void main(String[] args) {

        int num = 1;
        int remainder = num % 2;
        System.out.println(remainder);
        boolean isPrime = true;

        if (num == 1) {
            System.out.println("Number is not a prime number");
            return;
        }

        if (num < 1) {
            System.out.println("Invalid number.");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is a prime number.");
        } else {
            System.out.println("Number is not a prime number");
        }

    }
}