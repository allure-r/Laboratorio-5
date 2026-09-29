public class PruebaPilaActividad2 { // Prueba la pila de la actividad 2.
    public static void main(String[] args) { // Inicia las pruebas.
        Pila<Integer> pila = new Pila<>(3); // Crea una pila de tres posiciones.
        pila.push(10); // Agrega 10 al fondo.
        pila.push(20); // Agrega 20 al tope.
        System.out.println("Contiene 10: " + pila.contains(10)); // Debe mostrar true.
        System.out.println("Contiene 99: " + pila.contains(99)); // Debe mostrar false.
        System.out.println("Sale primero: " + pila.pop()); // Debe mostrar 20.
        System.out.println("Contiene 20: " + pila.contains(20)); // Debe mostrar false.
        System.out.println("Siguiente elemento: " + pila.pop()); // Debe mostrar 10.
    }
}