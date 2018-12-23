package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements RejectMsg Interface
 * GasPump1Factory uses this class
 * */
import Data.*;

public class SetInitialValues2 implements SetInitialValues {

	@Override
	public void SetInitialValues(DataStore d) {
		// TODO Auto-generated method stub
		d.setL(0);
	}

}
