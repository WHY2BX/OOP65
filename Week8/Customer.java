import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    /*private Account acct[];*/
    private ArrayList acct;
    private int numOfAccount = 0;
    
    //constructor
    public Customer(){
        this(null, null);
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        /*acct = new Account[5];*/
        acct = new ArrayList();
        
    }
    
    //methods
    public void addAccount(Account acct){
        /*this.acct[numOfAccount] = acct;*/
        this.acct.add(acct);
        numOfAccount ++;
    }
    public String toString(){
        return (this.firstName + this.lastName + " has " + this.numOfAccount + " accounts. ");
    }
    public Account getAccount(int index){
        /*return this.acct[index];*/
        return (Account)acct.get(index);
    }
    public int getNumOfAccount(){
        return this.numOfAccount;
    }
}
