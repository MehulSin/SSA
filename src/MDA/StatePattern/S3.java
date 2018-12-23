package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;

/* Design Pattern implemented: State Pattern 
 * This class extends State Class
*/
public class S3 extends State {
	public S3(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
    
	/* ********State Pattern*********** */
    public void Cancel()
    {
        o.CancelMsg(); //Displays CancelMsg from Output Processor
        m.ChangeState(0); //change state to S0
    	System.out.println("State 0 reached!");

    }
    
    public void SelectGas(int g)
    {
        o.SetPrice(g, m.M); //set price of the selected gas from Output Processor
        m.ChangeState(4);
    }
    
    public void Continue()
    {
    	m.ChangeState(4); //change state to S4
    	System.out.println("State 4 reached!");
    }
    /* ********************* */
}
