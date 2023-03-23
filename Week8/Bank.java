public class Bank {
    private Account acct[];
    private int numAcct = 0;
    
    //constructors
   public Bank(){
       acct = new Account[10];
   }
   
   //methods
   public void addAccount(Account ac){
           acct[numAcct] = ac;
            numAcct ++;
   }
   public Account getAccount(int index){
       return this.acct[index];
   }
   public int getNumAccount(){
       return this.numAcct;
   }
}
