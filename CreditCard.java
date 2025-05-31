import java.util.Date;

public class CreditCard implements PaymentMethod{
    private int creditCard;

    private PaymentType pt;

    private Date expiryDate;

    public CreditCard(int creditCard,Date expiryDate){
        this.creditCard = creditCard;
        this.expiryDate = expiryDate;
        pt = PaymentType.CREDIT_CARD;
    }

    //implement equals and hash
}
