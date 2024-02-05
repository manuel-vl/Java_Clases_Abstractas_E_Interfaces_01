package document_types;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Informe informe=new Informe("Texto informe",150, "Autor informe", "Revisor informe");
        System.out.println(informe.imprimirInformacion(informe));

        String[] habilidadesArray = {"Java", "C++", "Python"};
        Curriculum curriculum=new Curriculum("Manuel", "12345678", 23, habilidadesArray);
        System.out.println(curriculum.imprimirInformacion(curriculum));

        Libro libro=new Libro(400, "Autor libro", "Titulo", "Drama");
        System.out.println(libro.imprimirInformacion(libro));
    }
}
