package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;

/* Design Pattern implemented: State Pattern 
 * This class extends State Class
*/

public class Start extends State {

    public Start(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
    
    public void Activate()
    {
        o.StorePrices(); //store entered price of the different types of gas based on the selected gas pumps from Output Processor.
        m.ChangeState(0); //change state to S0
    	System.out.println("State 0 reached!");

    }

}
