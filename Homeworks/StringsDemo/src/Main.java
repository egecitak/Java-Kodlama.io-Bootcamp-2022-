public class Main {

    public static void main(String[] args) {

        String message = "Bugün hava çok güzel.";
        System.out.println(message);

        /*System.out.println("Character count: " + message.length());
        System.out.println("5. character: " + message.charAt(4));
        System.out.println(message.concat(" Yaþasýn!"));
        System.out.println(message);
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));

        char[] chars = new char[5];
        message.getChars(0, 5, chars, 0); //5 not included
        System.out.println(chars);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf('a'));*/

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.substring(2, 5)); //5 not included

        for (String word: message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());


    }
}
