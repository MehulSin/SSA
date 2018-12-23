package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements PumpGasUnit Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class PumpGasUnit2 implements PumpGasUnit {

	@Override
	public void PumpGasUnit(DataStore d) {
		// TODO Auto-generated method stub
		System.out.println("Pumped 1 liter of gas...");
        
		//calculate total gas pumped
        int l = d.getL();
        l = l + 1;
        d.setL(l);
        
        //calculate total price of the pumped gas
        float price = d.getprice();
        float total = d.gettotal();
        total = price*l;
        d.settotal(total);
	}

}
