public class Owner {
    protected final String name;
    protected Animal animal;
    
    //constructor
    public Owner(){
       this("", null);
    }
    public Owner(String name){
       this(name, null);
    }
    public Owner(Animal animal){
       this("", animal);
    }
    public Owner(String name, Animal animal){
       this.name = name;
       this.animal = animal;
    }
    
    //methods
    public void protectOwnerFrom(Animal a){
        if (this.animal instanceof Dog){
            ((Dog)this.animal).kick(a);
        }
        else{
            ((Pigeous)this.animal).wingAttack(a);
        }
    }
    
    public void feedFood(Food f){
        this.getAnimal().eat(f);
    }
    
    public String toString(){
        return ("Owner : name = "+ this.name + ", Animal : name = " + this.animal.getName() + ", power = " + this.animal.getPower() + ", age = " + this.animal.getAge());
    }
    
    //setter, getter
    public String getName(){
        return this.name;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return this.animal;
    }
}
