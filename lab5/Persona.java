public class Persona { // Clase que representa a una persona

    private String nombre; // Almacena el nombre de la persona

    public Persona(String nombre) { // Constructor que recibe el nombre de la persona
        this.nombre = nombre; // Inicializa el nombre de la persona
    }

    @Override // Indica que se sobrescribe el método toString de Object
    public String toString() { // Método que representa la persona como texto
        return nombre; // Retorna el nombre de la persona
    }

}
