package bankaccount;

/**

 @author User
 */
public class Deposit extends Transaction {

    public Deposit(int amount) {
        super(amount);
    }

    @Override
    public void print() {
        System.out.println(super.toString()+ " deposit");
    }
    
    
    
}
