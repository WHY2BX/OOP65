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
        return ("My name is " + this.getName() + ".\nI have " + this.getEnergy() + " energy left.\nI have a balance of " + this.getWallet().getBalance() + " baht.");
    }
    
    public boolean buyFood(Seller s){
        Food f = s.sell(this);
        if(f == null){
            this.toString();
            return false;
        }
        else{
            this.eat(f);
            return true;
        }
    }
    
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    
    //Setter, Getter
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    
    public Wallet getWallet(){
        return wallet;
    }
    
    public void setEnergy(int energy){
        this.energy = energy;
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