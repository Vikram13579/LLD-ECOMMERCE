import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
    private String name;

    private int number;

    private String gmail;

    public User(String name,int number,String gmail){
        this.name = name;
        this.number = number;
        this.gmail = gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGmail() {
        return gmail;
    }

    @Override
    public void update(Observable o, Object arg){
        System.out.println("this is the error message");
    }

    
    
}