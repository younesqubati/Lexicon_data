package bankaccount;

import java.util.ArrayList;
import java.util.List;

/**

 @author User
 */
public class Account {
 private final int number;
 private int balance;
 private String owner;
  private static int nAccount = 0;
  private List<Transaction> transactionList;

    public Account(String ownder) {
        this.owner = ownder;
        balance =0;
        nAccount++;
        number = nAccount;
        transactionList = new ArrayList<Transaction>();
        transactionList.add(new Creation());
    }
  
  public void deposit (int amount){
      balance = balance+amount;
      transactionList.add(new Deposit(amount));
  }
  
  public void withdraw(int amount){
      if(amount >balance){
          System.out.println("not enough money");
      }else
      {
          balance = balance - amount;
          transactionList.add(new Withdrawal(amount));
      }
  }
  
  public int getBalance(){
      return balance;
  }
  
  public void transferTo(int amount , Account toAccount){
      if(amount >balance){
          System.out.println("Transfer: No enough money");
      }else
      {
          balance = balance - amount;
          transactionList.add(new TransferTo(amount , toAccount));
          toAccount.balance = toAccount.balance+ amount;
          transactionList.add(new TransferFrom(amount , this));
      }
  }
  
  public void printAll(){
      System.out.println(this.owner + " "+ number + " "+ this.balance );
      System.out.println("Transactions");
      for (Transaction transaction : transactionList) {
          transaction.print(); 
      }
  }

    public String getOwner() {
        return owner;
    }
  
  
  
}
