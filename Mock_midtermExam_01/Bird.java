public abstract class Bird extends Animal implements Flyable {
    
    //constructor
    public Bird(String name, int age){
        super(name, 150, age);
    }
    
    //methods
    public abstract void wingAttack(Animal a);
}
