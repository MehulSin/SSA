package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements ReadyMsg Interface
 * GasPump2Factory uses this class
 * */
public class ReadyMsg2 implements ReadyMsg {

	@Override
	public void ReadyMsg() {
		// TODO Auto-generated method stub
		System.out.println("Gas Pump ready for pumping !");
	}

}
