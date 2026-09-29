public class InvalidSubscriptException extends RuntimeException { // Representa indices invalidos.
    public InvalidSubscriptException(String mensaje) { // Recibe la causa del error.
        super(mensaje); // Entrega el mensaje a RuntimeException.
    }
}
