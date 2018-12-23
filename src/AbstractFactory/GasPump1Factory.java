package AbstractFactory;
import Data.*;
import OutputProcessor.StrategyPattern.*;
/* Design Pattern implemented: Abstract Factory 
 * This class acts as a concrete Factory for GasPump1 in Abstract Factory Design Pattern
 */
public class GasPump1Factory implements AbstractFactory {
	
	@Override
    public DataStore getDataStore() {
        return new DataStore1();
    }
	 
	 @Override
	    public CancelMsg getCancelMsg() {
	       return new CancelMsg1(); 
	    }
	 
	 @Override
	    public DisplayMenu getDisplayMenu() {
	        return new DisplayMenu1();
	    }
	 
	 @Override
		public EnterPinMsg getEnterPinMsg() {
			return new EnterPinMsg1();
		}
	
	 @Override
	    public GasPumpedMsg getGasPumpedMsg() {
	        return new GasPumpedMsg1();
	    }

	    @Override
	    public InitializeValues getInitializeValues() {
	        return  new InitializeValues1();
	    }
	 
	 @Override
	    public PayMsg getPayMsg() {
	        return  new PayMsg1();
	    }
	 
	 @Override
	    public PrintReceipt getPrintReceipt() {
	        return new PrintReceipt1();
	    }
	    
	 @Override
	    public PumpGasUnit getPumpGasUnit() {
	        return new PumpGasUnit1();
	    }
	 
	 @Override
	    public ReadyMsg getReadyMsg() {
	        return new ReadyMsg1();
	    }
	 
	 @Override
	    public RejectMsg getRejectMsg() {
	           return new RejectMsg1();
	    }
	 
    
	@Override
    	public SetPrice getSetPrice() {
        	return new SetPrice1();
    	}
    
    @Override
    	public StopMsg getStopMsg() {
        	return new StopMsg1();
    	}
    
    @Override
		public SetInitialValues getSetInitialValues() {
			return new SetInitialValues1();
		}

	@Override
	public StorePrice getStorePrices() {
		return new StorePrice1();
	}

	@Override
	public WrongPinMsg getWrongPinMsg() {
		return new WrongPinMsg1();
	}

	@Override
	public StorePin getStorePin() {
		return new StorePin1();
	}

	@Override
	public StoreCash getStoreCash() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash1();
	}

	

}
