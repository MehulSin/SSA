package OutputProcessor.StrategyPattern;
/*
 * This is an interface for StoreCash
 */
import Data.*;


public class StorePin1 implements StorePin{
    @Override
	public void StorePin(DataStore d)
	{
    	d.setpin(d.gettemp_p());   	
	}
}
