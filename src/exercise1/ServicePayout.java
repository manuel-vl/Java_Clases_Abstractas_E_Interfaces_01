package exercise1;

public class ServicePayout implements ITransactionable{
    @Override
    public void transactionOk() {
        System.out.println("Pagando servicio.");
    }

    @Override
    public void transactionNoOk() {
        System.out.println("Error al pagar servicio.");
    }
}
