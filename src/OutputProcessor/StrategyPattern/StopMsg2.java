package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StopMsg Interface
 * GasPump2Factory uses this class
 * */
public class StopMsg2 implements StopMsg {

	@Override
	public void StopMsg() {
		// TODO Auto-generated method stub
		System.out.println("Gas pump has stopped!");
        System.out.println("Please choose your option for your receipt: ");
        System.out.println("-- Receipt");
        System.out.println("-- No Receipt");
	}

}
