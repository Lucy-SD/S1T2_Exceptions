package level1.exercise1.exceptions;

public class EmptySaleException extends Exception {

    public EmptySaleException() {
        super("Error encontrado ¡! Para realizar una venta, primero debes agregar productos a la misma.\n");
    }
}