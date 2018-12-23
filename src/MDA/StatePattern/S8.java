package MDA.StatePattern;

import MDA.MDAEFSM;
import OutputProcessor.OutputProcessor;

	
	public class S8 extends State {
		public S8(MDAEFSM m, OutputProcessor o)
	    {
	        this.m = m;
	        this.o = o;
	    }
	  
	public void CorrectPin()
		{
			m.ChangeState(3);
			System.out.println("State 3 reached!");
    	}
    	
    public void InCorrectPin()
    	{
    		System.out.println("The pin is incorrect");
    		m.ChangeState(0);
    		System.out.println("State 0 reached!");         
    	}//change state to S0


}
