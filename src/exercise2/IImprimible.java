package exercise2;

public interface IImprimible<T> {
    default <T> void imprimir(T doc){
        System.out.println(doc.toString());
    }

    void otraFormaImprimir();
}
