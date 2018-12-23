package InputProcessor;
/* 
 * This class acts as an Input Processor for GasPump-2
 */
import MDA.*;
import Data.*;


public class GasPump2 {
	private MDAEFSM m;
    private DataStore d;
   
    public GasPump2(MDAEFSM m, DataStore d)
    {
        this.m = m;
        this.d = d;
    }
    
    //Activate Gas Pump-1 and takes price of regular gas and super gas from the user
    public void Activate(float a, float b, float c){
        if(a>0 && b>0 && c>0)
        {
            d.setTemp_a(a); // set price of regular gas to temporary variable
            d.setTemp_b(b); // set price of super gas to temporary variable
            d.setTemp_c(c); // set price of premium gas to temporary variable
            m.Activate(); //calls Activate() in MDAEFSM class
        }
    }
    
    //User selects Start
    public void Start(){
        m.Start(); //calls start() in MDAEFSM class
    }
    
    //User selects PayCash
    public void PayCash(float c){
        //check if user enters value of cash as positive integer
    	if(c>0)
        {
            d.settemp_cash(c); //set cash deposited to temporary variable in Data Store 2 class
            m.PayType(2); // calls PayCash() in MDAEFSM class
           
        }
    }
    
    //User selects PayCredit
    public void PayCredit(){  
    	m.M=1;
        m.PayType(1); //calls PayCredit() in MDAEFSM class
        
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
    
    //User selects Premium gas
    public void Premium(){
        m.SelectGas(3); //calls SelectGas() in MDAEFSM class and tell it that the user has selected Premium gas
        m.Continue();
    }
    
    //User selects Regular gas
    public void Regular(){
        m.SelectGas(1); //calls SelectGas() in MDAEFSM class and tell it that the user has selected Regular gas
        m.Continue();
    }
    
    //User selects super gas
    public void Super(){
        m.SelectGas(2); //calls SelectGas() in MDAEFSM class and tell it that the user has selected Super gas
        m.Continue();
    }
    
    //User selects Start Pump
    public void StartPump(){
        m.StartPump();
    }
    
    //User selects Pump Liter
    public void PumpLiter(){        	
        float cash = d.getcash(); //fetch cash stored from Data Store 2 class
        int L = d.getL(); // fetch Liters from Data Store 2 class
        float price = d.getprice(); //fetch price of the selected gas from Data Store class
        
        //check if user has enough cash to pump liters
        if(cash>0&&cash < price*(L+1))
        {
        	System.out.println("Sorry! Not enough cash to pump the selected gas.");
        	m.StopPump(); //calls Pump() in MDAEFSM class
        }
        else
        {
            m.Pump();  //calls StopGasPump() in MDAEFSM class
        }
    }
    
    //User selects Stop
    public void Stop(){
        m.StopPump(); //calls StopGasPump() in MDAEFSM class
    }
    
    //User selects Receipt
    public void Receipt(){
    	System.out.println("Printing Receipt");
        m.Receipt(); //calls Receipt() in MDAEFSM class
    }
    
    //User selects No Receipt
    public void NoReceipt(){
        m.NoReceipt(); //calls NoReceipt() in MDAEFSM class
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

}
