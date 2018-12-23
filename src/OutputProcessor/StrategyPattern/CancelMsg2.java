package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements CancelMsg Interface
 * GasPump2Factory uses this class
 * */
public class CancelMsg2 implements CancelMsg {

	@Override
	public void CancelMsg() {
		// TODO Auto-generated method stub
        System.out.println("Purchase Cancelled !"); //CancelMsg

	}

}
