import java.util.ArrayList; // Importa ArrayList para almacenar múltiples elementos

public class Contenedor<F, S> { // Clase genérica que puede almacenar pares de tipos F y S

    private ArrayList<Par<F, S>> pares; // Almacena una lista de objetos Par con tipos F y S

    public Contenedor() { // Constructor que crea el contenedor
        pares = new ArrayList<>(); // Inicializa la lista vacía de pares
    }

    public void agregarPar(F primero, S segundo) { // Método que permite agregar un nuevo par
        Par<F, S> nuevoPar = new Par<>(primero, segundo); // Crea un nuevo objeto Par
        pares.add(nuevoPar); // Agrega el nuevo par a la lista
    }

    public Par<F, S> obtenerPar(int indice) { // Método que obtiene un par mediante su posición
        if (indice < 0 || indice >= pares.size()) { // Verifica que el índice esté dentro del rango válido
            System.out.println("Indice no valido"); // Muestra un mensaje si el índice no es válido
            return null; // Retorna null porque no existe un par en esa posición
        }

        return pares.get(indice); // Retorna el par ubicado en el índice indicado
    }

    public ArrayList<Par<F, S>> obtenerTodosLosPares() { // Método que obtiene todos los pares
        return pares; // Retorna la lista completa de pares
    }

    public void mostrarPares() { // Método que muestra todos los pares almacenados
        for (Par<F, S> par : pares) { // Recorre cada par almacenado en la lista
            System.out.println(par); // Muestra el par utilizando el método toString()
        }
    }
}