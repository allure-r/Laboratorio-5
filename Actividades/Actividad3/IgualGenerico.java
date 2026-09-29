public class IgualGenerico { // Resuelve la actividad 3.
    public static <T> boolean esIgualA(T primero, T segundo) { // Acepta argumentos de referencia.
        if (primero == null) { // Evita invocar equals sobre null.
            return segundo == null; // Dos valores null se consideran iguales.
        }
        return primero.equals(segundo); // Delega la comparacion al tipo del objeto.
    }

    public static void main(String[] args) { // Ejecuta los casos de demostracion.
        System.out.println("int: " + esIgualA(5, 5)); // true; autoboxing convierte a Integer.
        System.out.println("double: " + esIgualA(2.5, 2.5)); // true; convierte a Double.
        System.out.println("char: " + esIgualA('A', 'B')); // false; los caracteres difieren.
        System.out.println("boolean: " + esIgualA(true, true)); // true; convierte a Boolean.
        System.out.println("null y null: " + esIgualA(null, null)); // true; ambos son null.
        System.out.println("null y texto: " + esIgualA(null, "Java")); // false; solo uno es null.
        System.out.println("texto y null: " + esIgualA("Java", null)); // false; String.equals admite null.
        Object objeto = new Object(); // Crea un objeto sin redefinir equals.
        System.out.println("Mismo Object: " + esIgualA(objeto, objeto)); // true; es la misma referencia.
        System.out.println("Distinto Object: " + esIgualA(objeto, new Object())); // false; son objetos diferentes.
        Integer numero1 = 150; // Crea un valor entero.
        Integer numero2 = 150; // Crea otro valor igual.
        System.out.println("Integer: " + esIgualA(numero1, numero2)); // true; equals compara el valor.
        String texto1 = new String("Java"); // Crea una referencia de texto.
        String texto2 = new String("Java"); // Crea otra referencia con igual contenido.
        System.out.println("String: " + esIgualA(texto1, texto2)); // true; equals compara el contenido.
        System.out.println("Integer y Double: " + esIgualA(5, 5.0)); // false; son envoltorios diferentes.
    }
}
