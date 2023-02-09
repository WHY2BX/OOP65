public class Account{
    public double balance;
    public String name;
    
    public void deposit(double money)
    {
        if (money <= 0)
        {
            System.out.println("The balance variable must be grater than or equal to zero");
        }
        else
        {
            balance += money;
        }
    }
    
    public double withdraw(double money)
    {
        if (money <= 0)
        {
            System.out.println("The balance variable must be grater than or equal to zero");
        }
        else if (balance - money < 0)
        {
            System.out.println("Your account balance is insufficient");
        }
        else
        {
            balance -= money;
        }
        return balance;
    }
    
    public void showInfo()
    {
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht");
    }
}
