package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements CancelMsg Interface
 * GasPump1Factory uses this class
 * */
public class CancelMsg1 implements CancelMsg {

	@Override
	public void CancelMsg() {
		// TODO Auto-generated method stub
        System.out.println("Purchase Cancelled !"); //CancelMsg

	}

}
