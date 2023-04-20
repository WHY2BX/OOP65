public class Account {
    protected double balance;
    protected String name;
    
    //constructor
    public Account(double balance, String name){
        this.setName (name);
        this.setBalance(balance);
    }
    
    //methods
    public void deposit(double a){
        if (a > 0){
            this.setBalance(this.getBalance()+a);
            System.out.println(a + " baht is deposited to " + this.name + ".");
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public void withdraw(double a) throws WithdrawException {
        try{
            if (a > 0){
                this.setBalance(this.getBalance()-a);
                System.out.println(a + " baht is withdrawn from " + this.name + ".");
            }
            else if ( a <= 0 ){
                System.out.println("Input number must be a positive integer.");
            }
            else if ( (this.getBalance() - a) < 0){
                throw new WithdrawException("Account " + this.getName() + " has not enough money.");
            }
        }
        catch(WithdrawException ex){
            ex.printStackTrace();
        }
    }
    
    public void showAccount(){
        System.out.println(this.name + " account has " + balance + " baht.");
    }
    
    //setter, getter
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
}
