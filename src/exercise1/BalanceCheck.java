package exercise1;

public class BalanceCheck implements ITransactionable{
    @Override
    public void transactionOk() {
        System.out.println("Revisando balance");
    }

    @Override
    public void transactionNoOk() {
        System.out.println("No se pudo revisar balance");
    }
}
