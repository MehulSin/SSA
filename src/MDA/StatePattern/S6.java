package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;

/* Design Pattern implemented: State Pattern 
 * This class extends State Class
*/

public class S6 extends State {
	public S6(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
    
	/* **********State Pattern******** */
    public void Receipt()
    {
        o.PrintReceipt(); //Display total gas pumped and total price of the gas pumped from Output Processor
        o.ReturnCash(); // Returns remaining cash from Output Processor
        m.ChangeState(0); // change state to S0
    	System.out.println("State 0 reached!");

    }
    
    public void NoReceipt()
    {
        o.ReturnCash(); //Returns remaining cash from Output Processor
        m.ChangeState(0); //change state to S0
    	System.out.println("State 0 reached!");

    }

    /* **************** */
}
