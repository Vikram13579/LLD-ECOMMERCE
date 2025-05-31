public class Payment {
    public TransactionStatus execute(double price,PaymentMethod pm){
        System.out.println("transaction success");
        return TransactionStatus.SUCCESS;
    }
}
