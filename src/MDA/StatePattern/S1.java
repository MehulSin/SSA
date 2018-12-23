package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;

/* Design Pattern implemented: State Pattern 
 * This class extends State Class
 */
public class S1 extends State {
	
	public S1(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
	
	public void PayType(int t)
	{
		if(t==1)
		{
			PayCredit();
		}
		else if(t==2)
		{
			PayCash();
		}
		else if(t==3)
		{
			PayDebit();
		}
	}
	
	
    /* ****** State Patter***** */
    private void PayCredit()
    {
    	m.ChangeState(2); //change state to S2
    	System.out.println("State 2 reached!");

    }
    
    private void PayCash()
    {
        o.DisplayMenu(); //Displays Menu from Output Processor
        o.StoreCash(); //Stores deposited Cash from Output Processor
        m.ChangeState(3); //change state to S3
    	System.out.println("State 3 reached!");         
    }
    
    private void PayDebit()
    { //Displays Menu from Output Processor
    	o.EnterPinMsg();
    	o.StorePin();
    	m.ChangeState(7);
    	System.out.println("State 8 reached!");         
    }
    /* ************ */
    
    

    
    
}
