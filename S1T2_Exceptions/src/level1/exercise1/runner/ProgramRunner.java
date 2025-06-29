package level1.exercise1.runner;

import level1.exercise1.exceptions.EmptySaleException;
import level1.exercise1.model.Product;
import level1.exercise1.model.Sale;

public class ProgramRunner {

    public static void run() {

        String answer;

        Sale emptySale = new Sale();
        Sale notEmptySale = new Sale();

        System.out.println(" --- Testing añadir producto con precios positivos y negativos --- ");

        try {
            notEmptySale.setProducts(new Product("flores", 15.21f));
            System.out.println("Producto añadido correctamente a la cesta.");
            notEmptySale.setProducts(new Product("chuches", 2.25f));
            System.out.println("Producto añadido correctamente a la cesta.");
            notEmptySale.setProducts(new Product("chocolate", 3.75f));
            System.out.println("Producto añadido correctamente a la cesta.");
            emptySale.setProducts(new Product("no válido", -15.21f));
            System.out.println("Producto añadido correctamente a la cesta.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "El producto no se ha añadido a la cesta.\n");
        }


        System.out.println(" *** Testing compra con productos *** ");
        try {
            answer = notEmptySale.calculateTotal();
        } catch (EmptySaleException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        System.out.println(" --- Testing compra vacía --- ");
        try {
            answer = emptySale.calculateTotal();
        } catch (EmptySaleException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        System.out.println(" *** Testing index correcto *** ");
        try {
            answer = notEmptySale.getProductByIndex(2);
        } catch (IndexOutOfBoundsException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        System.out.println(" --- Testing index incorrecto --- ");
        try {
            answer = emptySale.getProductByIndex(1);
        } catch (IndexOutOfBoundsException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

    }
}
