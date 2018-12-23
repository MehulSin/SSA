package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/* Design Pattern implemented: State Pattern 
 * This class extends State Class
 */

public class S0 extends State {
	
	public S0(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
    
	/* State Pattern */
    public void Start()
    {
    	m.M = 0;
        o.PayMsg(); //Displays PayMsg from Output Processor
        m.ChangeState(1); //change state to S1
    	System.out.println("State 1 reached!");

    }

}
