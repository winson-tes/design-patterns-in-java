package factory;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        
        Product productA = productFactory.getProduct("PRODUCT_A");
        productA.doSomething();

        Product productB = productFactory.getProduct("PRODUCT_B");
        productB.doSomething();

        Product productDoesNotExist = productFactory.getProduct("DOES_NOT_EXIST");
        productDoesNotExist.doSomething(); // going to error because it's not a valid product
    }
}
