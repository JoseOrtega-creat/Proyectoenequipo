public class Persona {
    
    private String nombre;
    private int edad;
    private String genero;

   
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

  
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

 
    public void actividad() {
        System.out.println(nombre + " está realizando una actividad.");
    }
}
