package exercise1;

public class CashWithdrawal implements ITransactionable{
    @Override
    public void transactionOk() {
        System.out.println("Retirando dinero.");
    }

    @Override
    public void transactionNoOk() {
        System.out.println("Error al retirar dinero.");
    }
}
