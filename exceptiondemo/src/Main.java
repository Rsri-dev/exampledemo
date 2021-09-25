import com.cg.exception.InsufficientBalanceException;
import com.cg.modal.Account;
import com.cg.modal.Transaction;

public class Main {

	public static void main(String[] args) {
          Account a1=new Account(786,9000);
          try {
        	  Transaction.withdraw(a1,4001);
          }catch(InsufficientBalanceException ex) {
        	  System.out.println(ex.getMessage());
          }
         System.out.println("The Balnce - "+a1.getBalance()); 
	}

}
