import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Orders {
    HashMap<User,List<Item>> hm = new HashMap<>();
    public TransactionStatus buy(User u,Item i,PaymentType pt){
        Payment  p = new Payment();
        PaymentMethod pr = PaymentRepository.getPaymentMethod(pt);
        List<Item> list = null;
        if(hm.get(u) == null){
            list = new ArrayList<>();
        }
        else{
            list = hm.get(u);
        }
        list.add(i);
        hm.put(u,list);
        return p.execute(i.getPrice(),pr);
    }
}
