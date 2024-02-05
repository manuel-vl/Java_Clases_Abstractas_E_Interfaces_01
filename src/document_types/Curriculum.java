package document_types;

public class Curriculum {
    private String nombre;
    private String dni;
    private Integer edad;
    private String[] habilidades;

    // Constructor
    public Curriculum(String nombre, String dni, Integer edad, String[] habilidades) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.habilidades = habilidades;
    }

    // Getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
}
