public class Main {

    public static void main(String[] args) {
        //6 = 2 + 3 + 1
        //28 = 1 + 2 + 4 + 7 + 14
        //did improvements to find first arbitrary number of perfect numbers

        int count = 0;
        int num = 1;

        //change the number to find different amounts of perfect numbers, don't try to find more than 5
        //6. perfect number is 33550336 if you count 1 as the first perfect number
        //there is a better formula to calculate perfect numbers, check Wikipedia
        while (count != 5) {
            int sum = num == 1 ? 1 : 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                count++;
                System.out.println(count + ". perfect number is " + num);
            }
            num++;
        }
    }
}