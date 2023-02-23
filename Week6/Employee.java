public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public boolean equals(Employee e){
        return (this.name == name);
    }
    
    @Override
    public String toString(){
        return ("My name is " + this.getName() + "\nI have " + this.getEnergy() + "\nI have a balance of " + wallet.getBalance() + " baht.");
    }
    
    public boolean buyFood(Seller s){
        if(s.sell(this)==null){
            this.toString();
            return s.equals(this);
            
        }
        else{
            this.eat(s.sell(this));
            return true;
        }
    }
    
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    
    //Setter, Getter
    public void setName(String name){
        name = this.name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setWallet(Wallet wallet){
        wallet = this.wallet;
    }
    
    public Wallet getWallet(){
        return wallet;
    }
    
    public void setEnergy(int energy){
        energy = this.energy;
    }
    
    public int getEnergy(){
        return energy;
    }
    
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    
    public static String getNationality(){
        return nationality;
    }
}
