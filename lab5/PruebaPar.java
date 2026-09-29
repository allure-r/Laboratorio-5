public class PruebaPar { 

    public static void main(String[] args) { 

        Par<String, Integer> par1 = new Par<>("Ruth", 20); // Crea el primer par
        Par<String, Integer> par2 = new Par<>("Ruth", 20); // Crea el segundo par con los mismos valores
        Par<String, Integer> par3 = new Par<>("Elizabeth", 19); // Crea un tercer par con valores diferentes

        System.out.println("Par 1: " + par1); // Muestra el primer par
        System.out.println("Par 2: " + par2); // Muestra el segundo par
        System.out.println("Par 3: " + par3); // Muestra el tercer par

        System.out.println("¿Par 1 es igual a Par 2? " + par1.esIgual(par2)); // Compara los dos primeros pares
        System.out.println("¿Par 1 es igual a Par 3? " + par1.esIgual(par3)); // Compara el primer par con el tercero
        System.out.println("¿Par 2 es igual a Par 3? " + par2.esIgual(par3)); // Compara el segundo par con el tercero
    }
}