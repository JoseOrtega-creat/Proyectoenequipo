    public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String genero, String especialidad) {
        super(nombre, edad, genero);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void moverse() {
        System.out.println("El doctor " + getNombre() + " se está moviendo hacia su consulta");
    }

    public void realizarCirugia() {
        System.out.println("El doctor " + getNombre() + " está realizando una cirugía");
    }
}
