package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements ReadyMsg Interface
 * GasPump1Factory uses this class
 * */
public class ReadyMsg1 implements ReadyMsg {

	@Override
	public void ReadyMsg() {
		// TODO Auto-generated method stub
		System.out.println("Gas Pump ready for pumping !");
	}

}
