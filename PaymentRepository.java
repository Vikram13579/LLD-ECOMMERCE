import java.util.Date;

public  class PaymentRepository {
    public static PaymentMethod getPaymentMethod(PaymentType pt){
        if(pt == PaymentType.CREDIT_CARD){
            return new CreditCard(12341234, new Date());
        }
        if(pt == PaymentType.UPI){
            return new UPI(8989898);
        }

        return new Cash();
    }
}
