package level1.excercise1.runner;

import level1.excercise1.exceptions.EmptySaleException;
import level1.excercise1.model.Product;
import level1.excercise1.model.Sale;

public class ProgramRunner {

    public static void run() {

        String answer;

        Sale emptySale = new Sale();
        Sale notEmptySale = new Sale();

        Product flowers = new Product("flores", 15.21f);
        Product jellies = new Product("chuches", 2.25f);
        Product chocolate = new Product("chocolate", 3.75f);

        notEmptySale.setProducts(flowers);
        notEmptySale.setProducts(jellies);
        notEmptySale.setProducts(jellies);
        notEmptySale.setProducts(chocolate);

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
            answer = "Error encontrado ¡! No hay ningún producto en la posición solicitada.\n";
        }
        System.out.println(answer);

        System.out.println(" --- Testing index incorrecto --- ");
        try {
            answer = emptySale.getProductByIndex(1);
        } catch (IndexOutOfBoundsException e) {
            answer = "Error encontrado ¡! No hay ningún producto en la posición solicitada.\n";
        }
        System.out.println(answer);

    }
}
