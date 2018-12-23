package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements GasPumpedMsg Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class GasPumpedMsg2 implements GasPumpedMsg {

	@Override
	public void GasPumpedMsg(DataStore d) {
		// TODO Auto-generated method stub
		System.out.println("You have pumped: "+d.getL()+" Litres of Gas");
		float y;
		y=d.getL()*d.getprice();
		d.settotal(y);
		System.out.print("The total amount to be paid" + d.gettotal());
	}

}
