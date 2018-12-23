package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements SetPrice Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class SetPrice2 implements SetPrice {
	
	@Override
	public void SetPrice(int g, int m, DataStore d) {
		// TODO Auto-generated method stub
		
		//check if gas is regular, super or premium
		if(g==1)
        {
			 d.setprice(d.getRprice()); //fetch regular gas price
	         System.out.println("Regular Gas selected");
        }
        else if(g==2)
        {
            d.setprice(d.getSprice()); //fetch super gas price
            System.out.println("Super Gas selected");
        }
        else if(g==3)
        {
            d.setprice(d.getPprice()); //fetch premium gas price
            System.out.println("Premium Gas selected");
        }

        if (m == 1) {
            d.setprice(d.getprice() * (float)1.1);
            System.out.println("PRICE IS " + d.getprice());
        }
        else
        {
        	System.out.println("PRICE IS " + d.getprice());
        }
        
        System.out.println("Price for selected gas has been stored!");

	}
}
