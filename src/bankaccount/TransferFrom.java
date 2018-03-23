package bankaccount;

/**

 @author User
 */
public class TransferFrom extends Transaction {
    Account accountFrom;

    public TransferFrom(int amount, Account accountFrom) {
        super(amount);
        this.accountFrom = accountFrom;
    }

    @Override
    public void print() {
        System.out.println(super.toString() + " From account " + accountFrom.getOwner());
    }
    
}
