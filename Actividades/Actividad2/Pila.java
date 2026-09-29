import java.util.Objects; // Permite comparar valores que pueden ser null.

public class Pila<E> { // Version correspondiente a la actividad 2.
    private final int tamanio; // Guarda la capacidad maxima.
    private int superior; // Guarda el indice del tope.
    private final E[] elementos; // Mantiene los datos encapsulados.

    public Pila() { // Crea la pila predeterminada.
        this(10); // Reutiliza el constructor con capacidad.
    }

    @SuppressWarnings("unchecked") // Limita la advertencia a este constructor.
    public Pila(int capacidad) { // Conserva el comportamiento de la guia.
        tamanio = capacidad > 0 ? capacidad : 10; // Usa diez si la capacidad no es positiva.
        superior = -1; // Representa una pila vacia.
        elementos = (E[]) new Object[tamanio]; // Java no permite crear new E[].
    }

    public void push(E valor) { // Agrega un elemento al tope.
        if (superior == tamanio - 1) { // Comprueba si la pila esta llena.
            throw new ExcepcionPilaLlena("La pila esta llena."); // Impide exceder la capacidad.
        }
        superior++; // Avanza al siguiente espacio.
        elementos[superior] = valor; // Guarda el nuevo elemento.
    }

    public E pop() { // Retira y devuelve el ultimo elemento.
        if (superior == -1) { // Comprueba si la pila esta vacia.
            throw new ExcepcionPilaVacia("La pila esta vacia."); // Impide una extraccion invalida.
        }
        E valor = elementos[superior]; // Conserva el elemento que se devolvera.
        elementos[superior] = null; // Libera la referencia retirada.
        superior--; // Retrocede el tope una posicion.
        return valor; // Devuelve el elemento retirado.
    }

    public boolean contains(E elemento) { // Busca sin retirar elementos.
        for (int i = superior; i >= 0; i--) { // Recorre desde el tope hacia el fondo.
            if (Objects.equals(elementos[i], elemento)) { // Compara contenido y admite null.
                return true; // Termina al encontrar una coincidencia.
            }
        }
        return false; // No encontro el elemento.
    }

}
