public class EcommerceDemo {
    

    public static void main(String[] args){
        Item i1 = new Item("apple phone",ItemType.ELECTRONICS,22.00);

        Item i2 = new Item("MI phone",ItemType.ELECTRONICS, 15.00);

        User u = new User("vikram",8989898,"flikart@gmail.com");

        ItemManager im = new ItemManager();

        im.addItem(i1);

        im.addItem(i2);

        im.buyItem(u, i2, PaymentType.CREDIT_CARD);

        
    }

    //TransactionStatus ts = im.buy(u,i1,PaymentType.CREDIT_CARD);




}


