package Threads_Concepts;

public class Bank {
    public static void main(String[] args) {
        Account ABC=new Account(161,2000 );
        TransactionDeposite t1;
        TransactionWithdraw t2;
        t1=new TransactionDeposite(500,ABC);
        t2=new TransactionWithdraw(2000,ABC);
        t1.start();
        t2.start();
    }
}

class Account
{
    int accno;
    int bal;
    Account(int x,int y)
    {
        accno=x;
        bal=y;
    }
    synchronized void deposite(int amt)
    {
        bal=bal+amt;
        System.out.println("Credited +"+amt);
        System.out.println("Curr Balance : "+bal);
    }

    synchronized void withdraw(int amt)
    {
        if(bal>500)
        {
            if(bal>amt)
            {
                bal=bal-amt;
                System.out.println("Debited +"+amt);
                System.out.println("Curr Balance : "+bal);
            }
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println("Minimum Balance should be 500");
        }
    }
}

class TransactionDeposite extends Thread
{
    Account acc;
    int amount;
    TransactionDeposite(int x,Account a)
    {
        acc=a;
        amount=x;
    }

    public void run()
    {
        acc.deposite(amount);
    }
}

class TransactionWithdraw extends Thread
{
    Account acc;
    int amount;
    TransactionWithdraw(int x,Account a)
    {
        acc=a;
        amount=x;
    }

    public void run()
    {
        acc.withdraw(amount);
    }
}
