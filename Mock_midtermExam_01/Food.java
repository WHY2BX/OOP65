public abstract class Food {
    protected String name;
    
    //constructor
    public Food(){
        this.name = "";
    }
    
    //setter, getter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract int getPower();
}
