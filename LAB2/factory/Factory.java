// Factory pattern implementation in Java
package Lab2.factory;

// Product interface
interface Product {
    void showInfo();
}

// Concrete Product A
class ProductA implements Product {
    public void showInfo() {
        System.out.println("This is Product A");
    }
}

// Concrete Product B
class ProductB implements Product {
    public void showInfo() {
        System.out.println("This is Product B");
    }
}

// Factory class
public class Factory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("A")) {
            return new ProductA();
        } else if (type.equalsIgnoreCase("B")) {
            return new ProductB();
        } else {
            throw new IllegalArgumentException("Unknown product type");
        }
    }
}
