public class Dog extends Animal{
    //constructor
    public Dog(String name, int age){
        super(name, 200, age);
    }
    
    //methods
    public void eat(Food f){
        this.setPower(this.getPower() + f.getPower());
    }
    public void kick(Animal a){
        a.setPower(a.getPower()-10);
    }
}