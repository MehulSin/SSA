package OutputProcessor;
import Data.*;
import AbstractFactory.*;
import OutputProcessor.StrategyPattern.*;

/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern
 * This class acts as an Output Processor for both Gas Pump components GasPump-1 and GasPump-2 and also it acts as a context class
 * for Strategy Pattern 
*/
public class OutputProcessor {
	private DataStore data;
    private AbstractFactory abstractfactory;

    private PayMsg payMsg;
    private DisplayMenu displayMenu;
    private RejectMsg rejectMsg;
    private CancelMsg cancelMsg;
    private StoreCash storeCash;
    private SetPrice setPrice;
    private InitializeValues initializeValues;
    private ReadyMsg readyMsg;
    private StopMsg stopMsg;
    private PumpGasUnit pumpGasUnit;
    private GasPumpedMsg gasPumpedMsg;
    private ReturnCash returnCash;
    private PrintReceipt printReceipt;
    private StoreCash storecash;
    private StopMsg stopmsg;
    private CancelMsg cancelmsg; 
    private ReturnCash returncash; 
    private StorePrice storeprices;
    private SetInitialValues setinitialvalues;
    private WrongPinMsg wrongpinmsg;
    private StorePin storepin;
    private EnterPinMsg enterpinmsg;
    
    public OutputProcessor(AbstractFactory abstractfactory, DataStore data)
    {
        this.abstractfactory = abstractfactory;
        this.data = data;
        
        //Initialize Abstract Factory
        payMsg = abstractfactory.getPayMsg();
        displayMenu = abstractfactory.getDisplayMenu();
        rejectMsg = abstractfactory.getRejectMsg();
        cancelMsg = abstractfactory.getCancelMsg();
        storeCash = abstractfactory.getStoreCash();
        setPrice = abstractfactory.getSetPrice();
        initializeValues = abstractfactory.getInitializeValues();
        readyMsg = abstractfactory.getReadyMsg();
        stopMsg = abstractfactory.getStopMsg();
        pumpGasUnit = abstractfactory.getPumpGasUnit();
        gasPumpedMsg = abstractfactory.getGasPumpedMsg();
        returnCash = abstractfactory.getReturnCash();
        printReceipt = abstractfactory.getPrintReceipt(); 
        storecash=abstractfactory.getStoreCash();
        stopmsg=abstractfactory.getStopMsg();
        cancelmsg=abstractfactory.getCancelMsg(); 
        returncash=abstractfactory.getReturnCash(); 
        storeprices=abstractfactory.getStorePrices();
        setinitialvalues=abstractfactory.getSetInitialValues();
        wrongpinmsg=abstractfactory.getWrongPinMsg();
        storepin=abstractfactory.getStorePin();
        enterpinmsg=abstractfactory.getEnterPinMsg();
        
    }
    
    
    //Display PayMsg of selected gas pump 
    public void PayMsg()
    {
        payMsg.PayMsg();
    }
    
    //Display Menu of selected gas pump
    public void DisplayMenu()
    {
        displayMenu.DisplayMenu();
    }
    //Display price of gas according to mode of payment
    public void StorePrices()
    {
    	storeprices.StorePrices(data);
    }
    
    public void SetInitialValues()
    {
    	setinitialvalues.SetInitialValues(data);
    }
    
    public void WrongPinMsg()
    {
    	wrongpinmsg.WrongPinMsg();
    }
    
    public void StorePin()
    {
    	storepin.StorePin(data);
    }
    
    public void EnterPinMsg()
    {
    	enterpinmsg.EnterPinMsg();
    }
    
    //Display RejectMsg of selected gas pump
    public void RejectMsg()
    {
        rejectMsg.RejectMsg();
    }
    
    //Display CancelMsg of selected gas pump
    public void CancelMsg()
    {
        cancelMsg.CancelMsg();
    }
    
    //Store deposited cash of selected gas pump
    public void StoreCash()
    {
        storeCash.StoreCash(data);
    }
    
    //Set price of selected type of the gas of selected gas pump and mode of payment
    public void SetPrice(int g, int m)
    {
    	setPrice.SetPrice(g, m, data);
    }
    
    //Initialize values of gas and total of selected gas pump
    public void InitializeValues()
    {
        initializeValues.InitializeValues(data);
    }
    
    //Display ReadyMsg of selected gas pump
    public void ReadyMsg()
    {
        readyMsg.ReadyMsg();
    }
    
    //Display StopMsg of selected gas pump
    public void StopMsg()
    {
        stopMsg.StopMsg();
    }
    
    //Display appropriate units of gas pumped selected gas pump
    public void PumpGasUnit()
    {
        pumpGasUnit.PumpGasUnit(data);
    }
    
    //Display total units of gas pumped of selected gas pump
    public void GasPumpedMsg()
    {
        gasPumpedMsg.GasPumpedMsg(data);
    }
    
    //Return remaining cash after using  selected gas pump
    public void ReturnCash()
    {
        returncash.ReturnCash(data);
    }
    
    //Print Receipt after using selected gas pump
    public void PrintReceipt()
    {
        System.out.println("Printing Receipt");
        printReceipt.PrintReceipt(data);
    }
    
    //getter and setter methods
    public DataStore getD() {
        return data;
    }

    public void setD(DataStore data) {
        this.data = data;
    }

    public AbstractFactory getAf() {
        return abstractfactory;
    }

    public void setAf(AbstractFactory abstractfactory) {
        this.abstractfactory = abstractfactory;
    }

}
