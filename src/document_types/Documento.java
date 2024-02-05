package document_types;

public interface Documento<T> {
    default String imprimirInformacion(T doc){
        return doc.toString();
    };
}
