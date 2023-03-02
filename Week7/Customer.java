public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    //Constructor
    public Customer(){
        this("", "", null);
    }
     
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    
    //methods
    public String toString(){
        if (acct == null){
            return (firstName + " " + lastName + " doesn’t have account.");
        }
        else{
            return ("The " + this.firstName + " account has " + this.acct.getBalance() + " baht and " + this.acct.getCredit() + " credits.");
                }
    }
    
    public boolean equals(Customer c){
        return ((this.firstName == c.firstName) && (this.lastName == c.lastName));
    }
    
    //setter, getter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return this.acct;
    }
}
 