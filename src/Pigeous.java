public class Pigeous extends Bird{
    //constructor
    public Pigeous(){
        super("", 0);
    }
    public Pigeous(String name, int age){
        super(name, age);
    }
    
    //methods
    public void eat(Food f){
        this.setPower(this.getPower() + (f.getPower()*2));
    }
    public void fly(){
        System.out.println(this.getName() + " fly fly ....");
    }
    public void wingAttack(Animal a){
        a.setPower(a.getPower()-5);
    }
    public void wingAttack(Animal a, int times){
        for( int i = 1; i<= times; i++ ){
            a.setPower(a.getPower()-5);
        }   
    }
}
