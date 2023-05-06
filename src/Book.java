
import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private Double price;
    private String type;
    
    //defualt constructor
    public Book(){
        this("", 0.0, "");
    }
    
    public Book(String name, Double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    //setter, getter
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getPrice(){
        return this.price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
}
