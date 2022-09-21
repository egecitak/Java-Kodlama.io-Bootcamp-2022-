package OOP1;

public class Main {

    public static void main(String[] args) {

        String message = "Instalment Rate";

        Product product1 = new Product();

        product1.name = "Delonghi Coffee Maker";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitInStock = 3;
        product1.imageUrl = "coffeeMaker.jpg";

        System.out.println(product1.name);


    }
}