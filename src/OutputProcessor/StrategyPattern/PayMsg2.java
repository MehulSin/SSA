package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements PayMsg Interface
 * GasPump2Factory uses this class
 * */
public class PayMsg2 implements PayMsg {

	@Override
	public void PayMsg() {
		// TODO Auto-generated method stub
		System.out.println("Method of payment: ");
        System.out.println("-- PayCash");
        System.out.println("--PayCredit");

	}

}
