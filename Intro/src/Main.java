public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //variables are written using camelCase/
        String midText = "İlginizi çekebilir";
        String subText = "Vade süresi";

        System.out.println(midText);

        int months = 12;

        double dollarYesterday = 18.14;
        double dollarToday = 18.14;

        boolean isDollarDown = false;

        String arrowDirection = "";

        if (dollarToday < dollarYesterday)
        {
            arrowDirection = "down.svg";
            System.out.println(arrowDirection);
        }
        else if (dollarToday > dollarYesterday)
        {
            arrowDirection = "up.svg";
            System.out.println(arrowDirection);
        }
        else
        {
            arrowDirection = "equal.svg";
            System.out.println(arrowDirection);
        }

        //array
        String[] credits = {"Quick Credit", "For People who Get Their Paychecks From Halkbank", "Happy and Retired"};

        for (int i = 0; i < credits.length; i++)
        {
            System.out.println(credits[i]);
        }
    }
}
