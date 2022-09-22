package OOP1;

public class Main {

    public static void main(String[] args) {

        String message = "Instalment Rate";

        Product product1 = new Product();

        product1.setName("Delonghi Coffee Maker");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("coffeeMaker.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Coffee Maker");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitInStock(3);
        product2.setImageUrl("coffeeMaker2.jpg");

        Product product3 = new Product();
        product3.setName("Delonghi Coffee Maker");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitInStock(3);
        product3.setImageUrl("coffeeMaker3.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("5422224544");
        individualCustomer.setCustomerNumber("124455214");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroð");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("555669985");
        corporateCustomer.setTaxNumber("14577744");
        corporateCustomer.setCustomerNumber("54785");
    }
}