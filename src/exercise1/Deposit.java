package exercise1;

public class Deposit implements ITransactionable{
    @Override
    public void transactionOk() {
        System.out.println("Realizando deposito");
    }

    @Override
    public void transactionNoOk() {
        System.out.println("Error al realizar deposito");
    }
}
