public class Main { // Clase principal del programa

    public static <F, S> void imprimirPar(Par<F, S> par) { // Método genérico estático que recibe un objeto Par
        System.out.println(par); // Muestra el par utilizando el método toString()
    }

    public static void main(String[] args) { // Método principal donde comienza la ejecución del programa

        Par<String, Integer> par1 = new Par<>("Ruth", 20); // Crea un par con String como primer tipo e
                                                                            // Integer como segundo tipo

        Par<Double, Boolean> par2 = new Par<>(15.5, true); // Crea un par con Double como primer tipo y
                                                                            // Boolean como segundo tipo

        Persona persona = new Persona("Allison"); // Crea un objeto Persona con el nombre Carlos
        Par<Persona, Integer> par3 = new Par<>(persona, 25); // Crea un par con Persona como primer tipo
                                                                     // e Integer como segundo tipo

        System.out.println("Par String, Integer:"); // Muestra el tipo de par que se va a imprimir
        imprimirPar(par1); // Llama al método imprimirPar y muestra el primer par

        System.out.println("Par Double, Boolean:"); // Muestra el tipo de par que se va a imprimir
        imprimirPar(par2); // Llama al método imprimirPar y muestra el segundo par

        System.out.println("Par Persona, Integer:"); // Muestra el tipo de par que se va a imprimir
        imprimirPar(par3); // Llama al método imprimirPar y muestra el tercer par
    }
}

