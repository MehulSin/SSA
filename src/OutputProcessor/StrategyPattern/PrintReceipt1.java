package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements PrintReceipt Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;

public class PrintReceipt1 implements PrintReceipt {

	@Override
	public void PrintReceipt(DataStore d) {
		// TODO Auto-generated method stub
		System.out.println("This is your receipt for the gas that you have pumped: ");
        System.out.println("Gallons Pumped: "+d.getG()); //Display total Gas pumped
        System.out.println("Total Amount: $"+d.gettotal()); //Display total price of the pumped gas
	}

}
