public class Main {

    public static void main(String[] args) {

        char letter = '�';

        switch (letter) {
            case 'A', 'I', 'O', 'U':
                System.out.println("Thick vowel :)");
                break;
            case 'E', '�', '�', '�':
                System.out.println("Thin vowel :)");
                break;
            default:
                System.out.println("Please enter a vowel.");
        }

    }
}