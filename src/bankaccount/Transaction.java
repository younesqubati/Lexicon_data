package bankaccount;

import java.util.Date;

abstract class Transaction {
    private final int ID;
    private final Date date;
    private final int amount;
    private static int nTransaction;

    public Transaction(int amount) {
        nTransaction++;
        ID = nTransaction;
        date = new Date();
        this.amount = amount;
        
    }

    public abstract void print();
    
    @Override
    public String toString() {
        return "Transaction{" + "ID=" + ID + ", date=" + date + ", amount=" + amount + '}';
    }

    public int getID() {
        return ID;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public static int getnTransaction() {
        return nTransaction;
    }
    
    
    
    
}
