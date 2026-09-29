public class ExcepcionPilaVacia extends RuntimeException { // Indica que no hay elementos.
    public ExcepcionPilaVacia(String mensaje) { // Recibe el mensaje del error.
        super(mensaje); // Inicializa la excepcion padre.
    }
}
