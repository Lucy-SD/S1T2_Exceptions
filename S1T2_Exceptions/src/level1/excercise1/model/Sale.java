package level1.excercise1.model;

import level1.excercise1.exceptions.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private float totalPrice;

    public Sale() {
        this.products = new ArrayList<>();

    }

    public void setProducts(Product product) {
        this.products.add(product);
    }

    public String calculateTotal() throws EmptySaleException {
        String answer = "";

        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        for (Product product : products) {
            this.totalPrice += product.getPrice();
        }
        if (totalPrice != 0) {
            answer = "El precio total de esta venta es de " + this.totalPrice + "€.\n";
        }
        return answer;
    }

    public String getProductByIndex(int i) throws IndexOutOfBoundsException {
        String answer = "";

        if (products.isEmpty() || i > products.size()) {
            throw new IndexOutOfBoundsException();
        } else {
            answer = "El producto de la posición " + (i + 1) + " de su lista de compra es: " +
                    this.products.get(i).getName() + ".\n";
        }
        return answer;
    }

    public String toString() {
        return "Cantidad de productos: " + products.size() + ". Precio total: " + this.totalPrice + "€.\n";
    }
}
