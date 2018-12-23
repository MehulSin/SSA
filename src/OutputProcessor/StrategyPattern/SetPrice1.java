package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements SetPrice Interface
 * GasPump1Factory uses this class
 * */
import Data.*;

public class SetPrice1 implements SetPrice {
	
	
	@Override
	public void SetPrice(int g, int m, DataStore d) {
		// TODO Auto-generated method stub
		//check if gas is regular or super
		// System.out.println("RPrice : " + d.getRprice());
		// System.out.println("DPrice : " + d.getDprice());
	
		if(g==1)
        {
			float x;
            x=d.getRprice(); //fetch regular gas price
            d.setprice(x);
            System.out.println("Regular Gas selected");
        }
        else if(g==2)
        {
        	float y;
        	y= d.getDprice();
            d.setprice(y); //fetch super gas price
            System.out.println("Diesel Gas selected");
        }
		
        
        System.out.println("Price for selected gas has been stored!");

	}
}
