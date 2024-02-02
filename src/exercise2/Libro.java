package exercise2;

public class Libro implements IImprimible<Libro>{
    private Integer paginas;
    private String nombreAutor;
    private String titulo;
    private String genero;

    public Libro(Integer paginas, String nombreAutor, String titulo, String genero) {
        this.paginas = paginas;
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "paginas=" + paginas +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public void otraFormaImprimir() {
        System.out.println("Libro: "+ paginas+" - "+nombreAutor+" - "+titulo+" - "+genero);
    }
}
