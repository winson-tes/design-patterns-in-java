package factory;

public class ProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("product b :: done something");
    }
}