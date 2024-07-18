// Clase Deportista que hereda de Persona
public class Deportista extends Persona {
    private String deporte;

    // Constructor de Deportista
    public Deportista(String nombre, int edad, String genero, String deporte) {
        super(nombre, edad, genero); // Llama al constructor de Persona
        this.deporte = deporte;
    }

    // Getter para deporte
    public String getDeporte() {
        return deporte;
    }

    // Método moverse específico para Deportista
    public void moverse() {
        System.out.println("El deportista " + getNombre() + " se está moviendo hacia el gimnasio o la cancha");
    }

    // Método adicional para entrenar
    public void entrenar() {
        System.out.println("El deportista " + getNombre() + " está entrenando para su deporte");
    }
}
