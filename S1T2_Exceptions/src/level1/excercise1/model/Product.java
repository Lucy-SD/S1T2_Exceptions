package level1.excercise1.model;

public class Product {

    private String name;
    private float price;

    public Product(String name, float price) {
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
