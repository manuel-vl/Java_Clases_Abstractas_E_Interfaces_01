package exercise1;

public class Transfer implements ITransactionable{
    @Override
    public void transactionOk() {
        System.out.println("Transferencia ok.");
    }

    @Override
    public void transactionNoOk() {
        System.out.println("Error al realizar transferencia.");
    }
}
