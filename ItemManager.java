import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemManager {
    List<Item> l;
    HashMap<Item,Integer> hp;

    public ItemManager(){
        l = new ArrayList<>();

        hp = new HashMap<>();
    }

    public void addItem(Item i){
        l.add(i);
        hp.put(i,hp.getOrDefault(i,0)+1);
    }

    public void removeItem(Item i){
        l.remove(i);
        hp.put(i,hp.getOrDefault(i, 0)-1);
    }   

    public Item fetchItem(Item i){
        return hp.get(i) > 0 ? i : null;
    }

    public TransactionStatus buyItem(User u,Item i,PaymentType pt){
        hp.put(i,hp.getOrDefault(i, 0)-1);
        Orders o = new Orders();
        return o.buy(u,i,pt);
    }

}
