package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements ReturnCash Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;

public class SetInitialValues1 implements SetInitialValues {

	@Override
	public void SetInitialValues(DataStore d) {
		d.setG(0);
		// TODO Auto-generated method stub
		// No implementation
	}

}
