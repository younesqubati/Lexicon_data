package bankaccount;

/**

 @author User
 */
public class Withdrawal extends Transaction {

    public Withdrawal(int amount) {
        super(amount);
    }

    @Override
    public void print() {
        System.out.println(super.toString()+ " withdrawed");
    }
    
    
    
}
