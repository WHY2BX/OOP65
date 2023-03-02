public abstract class Vehicle implements Dieselable{
    protected double fuel;
    
    //constructor
    public Vehicle(){
        this(0.0);
    }
    public Vehicle(double fuel){
        this.fuel = fuel;
    }
    
    //methods
    public void addFuel(double fuel){
        
    }
    public abstract void honk();
    
    //setter, getter
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return this.fuel;
    }
}
