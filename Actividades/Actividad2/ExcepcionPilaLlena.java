public class ExcepcionPilaLlena extends RuntimeException { // Indica falta de espacio.
    public ExcepcionPilaLlena(String mensaje) { // Recibe el mensaje del error.
        super(mensaje); // Inicializa la excepcion padre.
    }
}
