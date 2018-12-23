package Data;
/* 
 * This class acts as an concrete class for storing data of GasPump-1
 */

public class DataStore1 extends DataStore {
	
	//Permanent variables

	private String pin;
	private float Rprice,Dprice;
    private float price;
    private float total;
    private int G;
    private String temp_p; 
    
    //Temporary variables
    private float temp_a, temp_b;

    //fetch price of regular gas stored in temporary variable
    public float getTemp_a() {
        return temp_a;
    }

    //set price of regular gas in temporary variable
    public void setTemp_a(float a) {
        temp_a = a;
    }

    //fetch price of diesel gas stored in temporary variable
    public float getTemp_b() {
        return temp_b;
    }
    
    //set price of diesel gas in temporary variable
    public void setTemp_b(float b) {
        temp_b = b;
    }
    
    //fetch the value of pin
    public String getpin() {
    	return pin;
    }
	
    //set the value of pin
	public void setpin(String x)
	{
		pin = x;
	}
	
	public String gettemp_p() {
        return temp_p;
    }

    //set price of regular gas in temporary variable
    public void settemp_p(String p) {
        temp_p = p;
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

    //get Diesel gas price
    public float getDprice() {
        return Dprice;
    }

    //set Diesel gas price
    public void setDprice(float Dprice1) {
        Dprice = Dprice1;
    }

    //fetch gallons pumped by the user
    public int getG() {
        return G;
    }

    //set gallons pumped by the user
    public void setG(int G) {
        this.G = G;
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
	public float getTemp_c() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_c(float c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float gettemp_cash() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void settemp_cash(float temp_cash) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public float getSprice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSprice(float Sprice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getcash() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setcash(float cash) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public int getL() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setL(int L) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public float getPprice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPprice(float Pprice) {
		// TODO Auto-generated method stub
		
	}

    
}
