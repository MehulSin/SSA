package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StopMsg Interface
 * GasPump1Factory uses this class
 * */
public class StopMsg1 implements StopMsg {

	@Override
	public void StopMsg() {
		// TODO Auto-generated method stub
		System.out.println("Gas pump has stopped!");
	}

}
