package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements GasPumpedMsg Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;

public class GasPumpedMsg1 implements GasPumpedMsg {

	@Override
	public void GasPumpedMsg(DataStore d) {
		// TODO Auto-generated method stub
		System.out.println("You have pumped: "+d.getG()+" Gallons of Gas");
		float y;
		System.out.println("G : " + d.getG());
		System.out.println("Price : " + d.getprice());
		y=d.getG()*d.getprice();
		System.out.println("Total " + y);
		d.settotal(y);
	}

}
