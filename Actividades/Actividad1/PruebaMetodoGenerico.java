public class PruebaMetodoGenerico { // Resuelve la actividad 1.
    public static <E> void imprimirArreglo(E[] arregloEntrada) { // Acepta arreglos de objetos.
        for (E elemento : arregloEntrada) { // Recorre todos los elementos.
            System.out.print(elemento + " "); // Imprime el elemento actual.
        }
        System.out.println();
    }

    public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, int subindiceSuperior) { // Sobrecarga con limites.
        if (subindiceInferior < 0 || subindiceInferior >= arregloEntrada.length) { // Valida el indice inicial.
            throw new InvalidSubscriptException("Indice inferior fuera del arreglo."); // Detiene la operacion.
        }
        if (subindiceSuperior < 0 || subindiceSuperior >= arregloEntrada.length) { // Valida el indice final.
            throw new InvalidSubscriptException("Indice superior fuera del arreglo."); // Informa el error.
        }
        if (subindiceSuperior <= subindiceInferior) { // Aplica la condicion de la guia.
            throw new InvalidSubscriptException("El indice superior debe ser mayor al inferior.");
        }
        for (int i = subindiceInferior; i <= subindiceSuperior; i++) { // Incluye ambos extremos.
            System.out.print(arregloEntrada[i] + " "); // Imprime la posicion seleccionada.
        }
        System.out.println();
        return subindiceSuperior - subindiceInferior + 1; // Cuenta los elementos impresos.
    }

    public static void main(String[] args) { // Ejecuta ambas versiones.
        Integer[] enteros = {1, 2, 3, 4, 5, 6}; // Usa Integer para admitir genericos.
        Double[] decimales = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7}; // Define valores decimales.
        Character[] letras = {'H', 'O', 'L', 'A'}; // Define caracteres como objetos.
        System.out.println("Enteros completos:");
        imprimirArreglo(enteros); // Llama a la version de un argumento.
        System.out.println("Cantidad: " + imprimirArreglo(enteros, 1, 4)); // Imprime 2, 3, 4 y 5.
        System.out.println("Decimales completos:");
        imprimirArreglo(decimales); // Reutiliza el mismo metodo generico.
        System.out.println("Cantidad: " + imprimirArreglo(decimales, 2, 5)); // Imprime cuatro valores.
        System.out.println("Letras completas:");
        imprimirArreglo(letras); // Imprime H, O, L y A.
        System.out.println("Cantidad: " + imprimirArreglo(letras, 0, 2)); // Imprime tres letras.
        try { // Prueba un rango rechazado por la guia.
            imprimirArreglo(enteros, 2, 2); // Los indices iguales no son validos.
        } catch (InvalidSubscriptException e) { // Captura la excepcion personalizada.
            System.out.println("Error controlado: " + e.getMessage()); // Explica la causa.
        }
    }
}
