public abstract class Animal {
    private String name;
    private int power;
    private int age;
    
    //constructor
    public Animal(){
        this("", 0, 0);
    }
    public Animal(String name, int power, int age){
        this.name = name;
        this.power = power;
        this.age = age;
    }
    
    //methods
    public abstract void eat(Food f);
    public String toString(){
        return("Animal : name = " + this.name+ ", power = " + this.power + ", age = " + this.age);
    }
    public boolean equals(Animal a){
        return (this.name == a.name && this.age == a.age);
    }
    
    //setter, getter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPower(int power){
        this.power = power;
    }
    public int getPower(){
        return this.power;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    
}
