package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements PayMsg Interface
 * GasPump1Factory uses this class
 * */
public class PayMsg1 implements PayMsg {

	@Override
	public void PayMsg() {
		// TODO Auto-generated method stub
		System.out.println("Method of payment: ");
        System.out.println("-- PayCredit");
        System.out.println("--PayDebit");
	}

}
