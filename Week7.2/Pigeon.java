public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    //constructor
    public Pigeon(){
        this(0.0, 0.0, 0.0);
    }
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        Pigeon.numberOfPigeon += 1;
    }
    
    //methods
    public void eat(String food){
        if (food == "worm"){
            this.setWeight(this.getWeight()+0.5);
        }
        else if (food == "seed"){
            this.setWeight(this.getWeight()+0.2);
        }
        else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    
    public void fly(){
        if (this.getWeight() >= 5){
            this.setWeight(this.getWeight()-0.25);
            System.out.println("Fly Fly");
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    public void takeOff(){
        if (this.getWeight() >= 5){
            this.setWeight(this.getWeight()-0.5);
            System.out.println("Take Off");
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    public void landing(){
        if (this.getWeight() >= 5){
            this.setWeight(this.getWeight()-0.5);
            System.out.println("Landing");
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    public String toString(){
        return ("Pigeon " + this.getWeight() + " kg and " + this.getHeight() + " cm. There are " + Pigeon.numberOfPigeon + " pigeons.");
    }
    //setter, getter
}
