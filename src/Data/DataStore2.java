package Data;
/* 
 * This class acts as an concrete class for storing data of GasPump-2
 */
public class DataStore2 extends DataStore {

	//Permanent variables

		
		private float Rprice,Sprice,Pprice;
	    private float price;
	    private float total;
	    private int L;
	    private float cash; 
	    
	    //Temporary variables
	    private float temp_a, temp_b,temp_c,temp_cash;

	    //fetch price of regular gas stored in temporary variable
	    public float getTemp_a() {
	        return temp_a;
	    }

	    //set price of regular gas in temporary variable
	    public void setTemp_a(float a) {
	        temp_a = a;
	    }

	    //fetch price of super gas stored in temporary variable
	    public float getTemp_b() {
	        return temp_b;
	    }
	    
	    //set price of super gas in temporary variable
	    public void setTemp_b(float b) {
	        temp_b = b;
	    }
	    
	  //fetch price of premium gas stored in temporary variable
	    public float getTemp_c() {
	        return temp_c;
	    }
	    
	    //set price of premium gas in temporary variable
	    public void setTemp_c(float c) {
	        temp_c = c;
	    }
	    
	  //fetch cash stored in temporary variable
	    public float gettemp_cash(){
	        return temp_cash;
	    }
	    
	    //set cash in temporary variable
	    public void settemp_cash(float csh) {
	        temp_cash = csh;
	    }
	    
		
	  //fetch cash stored in temporary variable
	    public float getcash() {
	        return cash;
	    }
	    
	    //set cash in temporary variable
	    public void setcash(float cash1) {
	    	cash = cash1;
	       }
	    
		//fetch price of the selected gas by the user 
	    public float getprice() {
	        return price;
	    }

	    //set price of the selected gas by the user 
	    public void setprice(float priceval) {
	        price = priceval;
	    }
	    
	    //get Regular gas price
	    public float getRprice() {
	        return Rprice;
	    }

	    //set Regular gas price
	    public void setRprice(float Rprice1) {
	        Rprice = Rprice1;
	    }

	    //get Super gas price
	    public float getSprice() {
	        return Sprice;
	    }

	  //set Super gas price
	    public void setSprice(float Sprice1) {
	        Sprice = Sprice1;
	    }
	    
	    //set Premium gas price
	    public void setPprice(float Pprice1) {
	        Pprice = Pprice1;
	    }
	    
	    //get Premium gas price
	    public float getPprice() {
	        return Pprice;
	    }

	    

	    //fetch liter of gas pumped by the user
	    public int getL() {
	        return L;
	    }

	    //set gallons pumped by the user
	    public void setL(int L) {
	        this.L = L;
	    }

	    //fetch total price of the pumped gas
	    public float gettotal() {
	        return total;
	    }

	    //set total price of the pumped gas
	    public void settotal(float total1) {
	        total = total1;
	    }

		@Override
		public String gettemp_p() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void settemp_p(String temp_p) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getpin() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setpin(String x) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public float getDprice() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setDprice(float Dprice) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public int getG() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setG(int G) {
			// TODO Auto-generated method stub
			
		}


}
