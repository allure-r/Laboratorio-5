import java.util.Objects; // Importa la clase Objects para comparar valores

public class Par<F, S> { // Clase genérica con dos parámetros de tipo

    private F primero; // Almacena el primer elemento del par
    private S segundo; // Almacena el segundo elemento del par

    public Par(F primero, S segundo) { // Constructor que recibe los dos elementos
        this.primero = primero; // Inicializa el primer elemento
        this.segundo = segundo; }// Inicializa el segundo elemento

    public F getPrimero() { // Método para obtener el primer elemento
        return primero; }// Retorna el primer elemento

    public S getSegundo() { // Método para obtener el segundo elemento
        return segundo;} // Retorna el segundo elemento

    public void setPrimero(F primero) { // Método para modificar el primer elemento
        this.primero = primero;} // Asigna el nuevo valor al primer elemento

    public void setSegundo(S segundo) { // Método para modificar el segundo elemento
        this.segundo = segundo; }// Asigna el nuevo valor al segundo elemento

    public boolean esIgual(Par<F, S> otro) { // Compara este par con otro par del mismo tipo
        if (otro == null) { // Verifica si el otro par es nulo
            return false; // Retorna false porque no se puede comparar con null
        }
        return Objects.equals(this.primero, otro.primero) // Compara los primeros elementos
                && Objects.equals(this.segundo, otro.segundo); // Compara los segundos elementos
    }

    @Override // Indica que se sobrescribe el método toString de Object
    public String toString() { // Metodo que representa el par como texto
        return "(Primero: " + primero + ", Segundo: " + segundo + ")"; // Retorna el par en el formato solicitado
    }
}