package Data;
/* 
 * This class acts as an abstract class for storing data of both the Gas Pumps
 */
public abstract class DataStore {
	
	//Abstract methods 
	public abstract float getTemp_a();

    public abstract void setTemp_a(float a);

    public abstract float getTemp_b();

    public abstract void setTemp_b(float b);

    public abstract float getTemp_c();

    public abstract void setTemp_c(float c);

	public abstract float gettemp_cash();
	
	public abstract void settemp_cash(float temp_cash);

	public abstract String gettemp_p();
	
	public abstract void settemp_p(String temp_p);
	
	public abstract String getpin();
	
	public abstract void setpin(String x);
	
	public abstract float getprice();
	
	public abstract void setprice(float price);
	
	public abstract float getSprice();
	
	public abstract void setSprice(float Sprice);
	
	public abstract float getRprice();
	
	public abstract void setRprice(float Rprice);
	
	public abstract float getDprice();
	
	public abstract void setDprice(float Dprice);
	
	public abstract float getPprice();
	
	public abstract void setPprice(float Pprice);
	
	public abstract float getcash();
	
	public abstract void setcash(float cash);
	
	public abstract float gettotal();
	
	public abstract void settotal(float total);
	
	public abstract int getL();
	
	public abstract void setL(int L);
	
	public abstract int getG();
	
	public abstract void setG(int G);
	
}
