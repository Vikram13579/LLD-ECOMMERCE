import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Item implements Subject{
    private String name;

    private ItemType itype;

    private double price;

    private List<Observer> l;

    public Item(String name,ItemType itype , double price){
        this.itype = itype;
        this.name  = name;
        this.price = price;
        l = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItype() {
        return itype;
    }

    public void setItype(ItemType itype) {
        this.itype = itype;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public void registerObserver(Observer o) {
        l.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        l.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: l){
            o.update(new Observable(), null);
        }
    }

    
}
