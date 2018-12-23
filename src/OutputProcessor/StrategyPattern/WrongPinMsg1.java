package OutputProcessor.StrategyPattern;

import Data.DataStore;

/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StoreCash Interface
 * GasPump1Factory uses this class
 * */

public class WrongPinMsg1 implements WrongPinMsg {

	
	@Override
	public void WrongPinMsg() {
		// TODO Auto-generated method stub
		System.out.print("Entered Pin is wrong");
	}

}
