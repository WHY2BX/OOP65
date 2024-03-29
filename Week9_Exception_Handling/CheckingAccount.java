public class CheckingAccount extends Account {
    private double credit;
    
    //constructor
    public CheckingAccount() { 
        super(0, "");
        credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    
    //methods
    @Override
    public void withdraw(double a) throws WithdrawException{
        double remain = this.getBalance()-a;
        double remainCredit = this.getBalance()+this.credit - a;
        try{
            if (remain >= 0){
                this.setBalance(this.getBalance()-a);
                System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            }
            else if ( remain < 0 && remainCredit >= 0){
                this.credit = (this.getBalance()+credit)-a;
                this.setBalance(0);
                System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            }
            else if ( remain < 0 && remainCredit < 0){
                throw new WithdrawException("Account " + this.getName() + " has not enough money.");
            }
        }
        catch(WithdrawException ex){
            ex.printStackTrace();
        }
    }
    
    public void withdraw(String a) throws WithdrawException{
        this.withdraw(Double.parseDouble(a));
    }
    
    public String toString(){
        return ("The " + this.name + " account has " + this.balance + " baht and " + this.credit + " credits.");
    }
    
    //setter, getter
    public void setCredit(double credit){
        this.credit = credit;
    }
    
    public double getCredit(){
        return this.credit;
    }
}