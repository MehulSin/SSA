package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;

/* Design Pattern implemented: State Pattern 
 * This class extends State Class
*/

public class S2 extends State {
	
	public S2(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
    
	/* ********State Pattern********* */
    public void Approved()
    {
        o.DisplayMenu(); //Display Menu from Output Processor
        m.ChangeState(3); //Change state to S3
    	System.out.println("State 3 reached!");

    }
    
    public void Reject()
    {
        o.RejectMsg(); //Display RejectMsg from Output Processor
        m.ChangeState(0); //change state to S0
    	System.out.println("State 0 reached!");

    }

    /* ********************** */
}
