package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements InitializeValues Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class InitializeValues2 implements InitializeValues {

	@Override
	public void InitializeValues(DataStore d) {
		// TODO Auto-generated method stub
        
        System.out.println("Initialized L=0 and Total=0");
	}

}
