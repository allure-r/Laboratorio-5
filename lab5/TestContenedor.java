public class TestContenedor { // Clase principal del programa

    public static void main(String[] args) { // Método principal donde comienza la ejecución del programa

        Contenedor<String, Integer> contenedor = new Contenedor<>(); // Crea un contenedor para pares String e Integer

        contenedor.agregarPar("Ruth", 20); // Agrega el primer par al contenedor
        contenedor.agregarPar("Allison", 25); // Agrega el segundo par al contenedor
        contenedor.agregarPar("Elizabeth", 19); // Agrega el tercer par al contenedor

        System.out.println("Todos los pares almacenados:"); // Muestra el título de la lista de pares
        contenedor.mostrarPares(); // Muestra todos los pares almacenados en el contenedor

        System.out.println("\nPar en el indice 1:"); // Muestra el título de la búsqueda
        System.out.println(contenedor.obtenerPar(1)); // Obtiene y muestra el par ubicado en el índice 1

        System.out.println("\nLista completa de pares:"); // Muestra el título de la lista completa
        System.out.println(contenedor.obtenerTodosLosPares()); // Obtiene y muestra todos los pares almacenados

        System.out.println("\nPrueba de indice invalido:"); // Muestra el título de la prueba de validación
        System.out.println(contenedor.obtenerPar(10)); // Intenta obtener un índice que no existe
    }
}
