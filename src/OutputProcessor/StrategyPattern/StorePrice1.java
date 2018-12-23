package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StoreData Interface
 * GasPump1Factory uses this class
 * */
import Data.*;

	public class StorePrice1 implements StorePrice {

		@Override
		public void StorePrices(DataStore d) {
			
			d.setRprice(d.getTemp_a()); 
			d.setDprice(d.getTemp_b());
			// TODO Auto-generated method stub
			// No implementation
		}

}
