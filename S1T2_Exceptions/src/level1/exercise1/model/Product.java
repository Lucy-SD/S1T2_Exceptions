package level1.exercise1.model;

public class Product {

    private final String name;
    private final float price;

    public Product(String name, float price) {
        if(price < 0) {
            throw new IllegalArgumentException("Error: El precio de un producto no puede ser negativo.\n");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String toString() {
        return "Producto: " + this.getName() + ". Precio: " + this.getPrice() + ".\n";
    }
}
