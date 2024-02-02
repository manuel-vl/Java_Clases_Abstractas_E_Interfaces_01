package exercise2;

import java.util.Arrays;

public class Curriculum implements IImprimible<Curriculum>{
    private String nombre;
    private Integer edad;
    private String[] habilidades;

    public Curriculum(String nombre, Integer edad, String[] habilidades) {
        this.nombre = nombre;
        this.edad = edad;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", habilidades=" + Arrays.toString(habilidades) +
                '}';
    }

    @Override
    public void otraFormaImprimir() {
        System.out.println("Curriculum: "+ nombre+" - "+edad+" - "+Arrays.toString(habilidades));
    }
}
