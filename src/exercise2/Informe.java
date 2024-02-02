package exercise2;

public class Informe implements IImprimible<Informe>{
    private String texto;
    private Integer numPaginas;
    private String autor;
    private String revisor;

    public Informe(String texto, Integer numPaginas, String autor, String revisor) {
        this.texto = texto;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "texto='" + texto + '\'' +
                ", numPaginas=" + numPaginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }

    @Override
    public void otraFormaImprimir() {
        System.out.println("Informe: "+ texto+" - "+numPaginas+" - "+autor+" - "+revisor);
    }
}
