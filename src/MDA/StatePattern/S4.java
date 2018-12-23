package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;

/* Design Pattern implemented: State Pattern 
 * This class extends State Class
*/
public class S4 extends State {
	public S4(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
    
	/* ********State Pattern********* */
    public void StartPump()
    {
        o.InitializeValues(); // Initialize values of gas and total from Output Processor
        o.ReadyMsg(); //Display ReadyMsg from Output Processor
        m.ChangeState(5); // change state to S5
    	System.out.println("State 5 reached!");

    }

    /* *********************** */
}
