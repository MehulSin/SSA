package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements PrintReceipt Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class PrintReceipt2 implements PrintReceipt {

	@Override
	public void PrintReceipt(DataStore d) {
		// TODO Auto-generated method stub
		float amountreturned = d.getcash()-d.gettotal();
		System.out.println("Cash amount : " + d.getcash()); 
		System.out.println("This is your receipt for the gas that you have pumped: ");
        System.out.println("Liters Pumped: "+d.getL()); //Display total gas pumped
        System.out.println("Total Amount: $"+d.gettotal()); //Display total price of the gas pumped
       
        if(amountreturned>0) {
        	System.out.println("Amount to be returned to the customer: $"+amountreturned); 
        }
        else
        {
        	System.out.println("Cash required"+ d.gettotal()+"is more than cash given"+d.getcash());
        }
	}

}
