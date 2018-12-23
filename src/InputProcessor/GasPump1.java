package InputProcessor;
/* 
 * This class acts as an Input Processor for GasPump-1
 */
import MDA.*;
import Data.*;


public class GasPump1 {
	private MDAEFSM m;
    private DataStore d;
    
    public GasPump1(MDAEFSM m, DataStore d)
    {
        this.m = m;
        this.d = d;
    }
    //Activate Gas Pump-1 and takes price of regular gas and super gas from the user
    public void Activate(float a, float b){    
        if(a>0 && b>0)
        {
            d.setTemp_a(a); // set price of regular gas to temporary variable
            d.setTemp_b(b); // set price of super gas to temporary variable
            m.Activate(); //calls Activate() in MDAEFSM class
        }
    }
    
    //User selects Start
    public void Start(){  
        m.Start(); //calls Start() in MDAEFSM class
    }
    
    //User selects PayCredit
    public void PayCredit(){    
        m.PayType(1); //calls PayCredit() in MDAEFSM class
    }
    
  //User selects PayDebit
    public void PayDebit(String p){
    	d.settemp_p(p);
    	m.PayType(3); //calls PayDebit() in MDAEFSM class
    }
    
    //User selects PayCredit
    public void PayCash(){    
        m.PayType(2); //calls PayDebit() in MDAEFSM class
    }
    
    
    public void Pin(String x) {

    	if(x.equals(d.getpin()))
    	{
    		m.CorrectPin();
    	}
    	else
    	{
    		m.InCorrectPin();
    	}
    	
    }
    
    //User selects Reject
    public void Reject(){
        m.Reject(); //calls Reject() in MDAEFSM class
    }
    
    //User selects Cancel
    public void Cancel(){
        m.Cancel(); //calls Cancel() in MDAEFSM class
    }
    
    //User selects Approved
    public void Approved(){
        m.Approved(); //calls Approved() in MDAEFSM class
    }
    
    //User selects Diesel gas
    public void Diesel(){
        m.SelectGas(2); //calls SelectGas() in MDAEFSM class and tell it that the user has selected Super gas
    }
    
    //User selects Regular gas
    public void Regular(){
        m.SelectGas(1); //calls SelectGas() in MDAEFSM class and tell it that the user has selected Regular gas
    }
    
    //User selects Start Pump
    public void StartPump(){
        m.StartPump(); //calls StartPump() in MDAEFSM class
    }
    
    //User selects Pump Gallon
    public void PumpGallon(){
        m.Pump(); //calls pump() in MDAEFSM class
    }
    
    //User selects Stop Pump
    public void StopPump(){
        m.StopPump(); //calls StopGasPump() in MDAEFSM class
        m.Receipt(); //calls Receipt() in MDAEFSM class
    }
    
    public void FullTank(){
        m.StopPump(); //calls StopGasPump() in MDAEFSM class
        m.Receipt(); //calls Receipt() in MDAEFSM class
    }
    
    //Getter and setter methods for MDA and Data Store
    public MDAEFSM getMda() {
        return m;
    }

    public void setMda(MDAEFSM m) {
        this.m = m;
    }

    public DataStore getDs() {
        return d;
    }

    public void setDs(DataStore d) {
        this.d = d;
    }
    
    public void Receipt(){
    	System.out.println("Printing Receipt");
        m.Receipt(); //calls Receipt() in MDAEFSM class
    }
    

}
