public class Main {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 25;
        int num3 = 2;
        int biggest = num1;

        if (num2 > biggest) {
            biggest = num2;
        }

        if (num3 > biggest) {
            biggest = num3;
        }

        System.out.println("Biggest number is: " + biggest);

    }
}