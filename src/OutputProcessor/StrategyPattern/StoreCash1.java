package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StoreCash Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;

public class StoreCash1 implements StoreCash {

	@Override
	public void StoreCash(DataStore d) {
		System.out.println("CASHING IN");
		d.setcash(d.gettemp_cash());
		System.out.println(d.getcash());
		System.out.println(d.gettemp_cash());
		System.out.println("CASHING OUT");
		// TODO Auto-generated method stub
		// No implementation
	}

}
