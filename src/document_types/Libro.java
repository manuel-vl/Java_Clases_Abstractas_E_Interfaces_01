package document_types;

public class Libro implements Documento<Libro>{
    private Integer numeroPaginas;
    private String nombreAutor;
    private String titulo;
    private String genero;

    // Constructor
    public Libro(Integer numeroPaginas, String nombreAutor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    // Getters and setters

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro {" +
                "numeroPaginas=" + numeroPaginas +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public String imprimirInformacion(Libro doc) {
        return Documento.super.imprimirInformacion(doc);
    }
}
