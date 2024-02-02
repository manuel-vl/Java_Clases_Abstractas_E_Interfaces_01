package exercise2;

public class Main {
    public static void main(String[] args) {
        Curriculum curriculum=new Curriculum("User 1", 23, new String[]{"Dev", "Sports"});
        Libro libro=new Libro(450, "Autor 1", "Teoria del Todo", "Fisica");
        Informe informe=new Informe("Informe texto", 20, "Autor 2", "Revisor 1");

        curriculum.otraFormaImprimir();
        curriculum.imprimir(curriculum);
    }
}
