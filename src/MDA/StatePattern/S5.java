package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;

/* Design Pattern implemented: State Pattern 
 * This class extends State Class
*/

public class S5 extends State {
	public S5(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
    
	/* *************State Pattern********** */
    public void Pump()
    {
    	
        o.PumpGasUnit(); //Pump specific unit of gas based on the selected Gas Pump from Output Processor 
        o.GasPumpedMsg(); //Display total units of gas pumped and total price from the Output Processor 
    }
    
    public void StopPump()
    {
    	System.out.println("Stopping gas pump");
        o.StopMsg(); //Display StopMsg from Output Processor
        System.out.println("Changing State to 6");
        m.ChangeState(6);// change state to S6
    	System.out.println("State 6 reached!");

    }

    /* ***************************** */
}
