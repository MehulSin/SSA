package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements RejectMsg Interface
 * GasPump1Factory uses this class
 * */
public class RejectMsg1 implements RejectMsg {

	@Override
	public void RejectMsg() {
		// TODO Auto-generated method stub
		System.out.println("Sorry! Your Credit Card has been rejected!");
	}

}
