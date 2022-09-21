public class Main {

    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {

            case 'A':
                System.out.println("Perfect, you have passed.");
                break;
            case 'B':
                System.out.println("Great, you have passed.");
                break;
            case 'C':
                System.out.println("Good, you have passed.");
                break;
            case 'D':
                System.out.println("Not Bad, you have passed.");
                break;
            case 'F':
                System.out.println("Unfortunately, you have failed.");
                break;
            default:
                System.out.println("Invalid grade is entered.");
        }

    }
}