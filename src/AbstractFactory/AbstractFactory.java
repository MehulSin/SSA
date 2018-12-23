package AbstractFactory;
import Data.*;
import OutputProcessor.StrategyPattern.*;

/* Design Pattern implemented: Abstract Factory 
 * This is an interface for Abstract Factory Design Pattern
 */


public interface AbstractFactory {
	
	DataStore getDataStore();
    PayMsg getPayMsg();
    DisplayMenu getDisplayMenu();
    RejectMsg getRejectMsg();
    CancelMsg getCancelMsg();
    StoreCash getStoreCash();
    SetPrice getSetPrice();
    InitializeValues getInitializeValues();
    ReadyMsg getReadyMsg();
    StopMsg getStopMsg();
    PumpGasUnit getPumpGasUnit();
    GasPumpedMsg getGasPumpedMsg();
    ReturnCash getReturnCash();
    PrintReceipt getPrintReceipt();
    StorePrice getStorePrices();
    SetInitialValues getSetInitialValues();
    WrongPinMsg getWrongPinMsg();
    StorePin getStorePin();
    EnterPinMsg getEnterPinMsg();
    
}
