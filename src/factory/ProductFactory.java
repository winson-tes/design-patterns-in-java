package factory;

public class ProductFactory {
    public Product getProduct(String product) {
        switch (product.toUpperCase()) {
            case "PRODUCT_A":
                return new ProductA();    
            case "PRODUCT_B":
                return new ProductB();        
            default:
                return null;
        }
    }
}
