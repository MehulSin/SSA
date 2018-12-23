package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements DisplayMenu Interface
 * GasPump1Factory uses this class
 * */
public class DisplayMenu1 implements DisplayMenu {

	@Override
	public void DisplayMenu() {
		// TODO Auto-generated method stub
		System.out.println("Select the type of gas:");
        System.out.println("--Regular");
        System.out.println("--Diesel");
	}

}
