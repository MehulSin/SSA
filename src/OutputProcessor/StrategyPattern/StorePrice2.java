package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StoreData Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;


	
	public class StorePrice2 implements StorePrice {

		@Override
		public void StorePrices(DataStore d) {
			
			d.setRprice(d.getTemp_a()); ;
			d.setSprice(d.getTemp_b());
			d.setPprice(d.getTemp_c());
			// TODO Auto-generated method stub
			// No implementation
		}

}


