public abstract class Houses {
    private String name;
    private String color;
    
    //constructor
    public Houses(){
        this("", "");
    }
    public Houses(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    //methods
    public String toString(){
        return ( "[House] : " + this.name + ", Color : " + this.color);
    }
    
    //setter, getter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor (String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
}
