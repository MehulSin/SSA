package Driver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


import AbstractFactory.*;
import Data.*;
import MDA.*;

import InputProcessor.*;
import OutputProcessor.*;


public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	String input = null;
    	int choice = 1;
    	
		System.out.println(" ******** Select Gas Pump *******" );
		System.out.println("          1. Gas Pump - 1" );
		System.out.println("          2. Gas Pump - 2" );
		 
		input = bufferedReader.readLine();
 		if(input.equalsIgnoreCase("1"))
		{

            //Create GasPump1Factory, DataStore, OutputProcessor, MDAEFSM and GasPump1 objects
			AbstractFactory absfac = new GasPump1Factory();
            DataStore ds = absfac.getDataStore();
            OutputProcessor op = new OutputProcessor(absfac, ds);
            MDAEFSM mda = new MDAEFSM(op);
            GasPump1 gp1 = new GasPump1(mda, ds);
            
           // gp1.Activate(1, 2);
           // gp1.Start();
           // gp1.PayDebit("1234");
           // gp1.Pin("abcd");
            // gp1.Regular();
            // gp1.StartPump();
            // gp1.PumpGallon();
         //   gp1.StopPump();
          
            
            System.out.println("*************************************");
            System.out.println("          Gas Pump-1" );	
            System.out.println("          MENU of Operations" );
            System.out.println("          1. Activate(a,b)" );
            System.out.println("          2. Start()" );
            System.out.println("          3. PayCredit()" );
            System.out.println("          4. Approved()" );
            System.out.println("          5. Reject()" );
            System.out.println("          6. PayDebit(p)" );
            System.out.println("          7. Cancel()" );
            System.out.println("          8. Regular()" );
            System.out.println("          9. Diesel()" );
            System.out.println("          10. StartPump()" );
            System.out.println("          11. PumpGallon()" );
            System.out.println("          12. StopPump()" );
            System.out.println("          13. FullTank()" );
            System.out.println("          q. Quit" );	
            System.out.println("  Please make a note of these operations" );	  	    	
            System.out.println("           Gas Pump-1 Execution" );

            
	        while (true) 
	        {
	        	
	        	System.out.println("  Select Operation: ");
	        	System.out.println("1-Activate,2-Start,3-PayCredit,4-Approved,5-Reject,6-Paydebit,7-Cancel,8-Regular,9-Diesel,10-StartPump,11-PumpGallon,12-StopPump,13-FullTank,q-Quit");
	             
				input = bufferedReader.readLine();
	
	            if(input.isEmpty()) continue;
	            if(input.equalsIgnoreCase("q"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	       
	            switch(choice)
                {
                case 1:   //Activate(a,b)
                    float a,b;
                    System.out.println("\n  Operation:  Activate(float a, float b)");
                    System.out.println("   Enter value of a:");
                    a = in.nextFloat();
                    System.out.println("   Enter value of b:");
                    b = in.nextFloat();
                    gp1.Activate(a, b);
                    break;
            
            case 2:   //Start()
                    System.out.println("\n  Operation:  Start()");
                    gp1.Start();
                    break;
                    
            case 3:   //PayCredit()
                    System.out.println("\n  Operation:  PayCredit()");
                    gp1.PayCredit();
                    break;
            
            case 4:   //Approved()
                    System.out.println("\n  Operation:  Approved()");
                    gp1.Approved();
                    break;        
            
            case 5:   //Reject()
                    System.out.println("\n  Operation:  Reject()");
                    gp1.Reject();
                    break;
                    
            case 6:  //PayDebit()
            		System.out.println("\n  Operation:  PayDebit()");
            		System.out.println("\n  Enter the pin");
            		String temp_p = in.next();           		
            		gp1.PayDebit(temp_p);
            		System.out.println("\n  Enter the pin");
            		String user_pin = in.next();
            		gp1.Pin(user_pin);
                    break;
                    
            case 7:   //Cancel()
                    System.out.println("\n  Operation:  Cancel()");
                    gp1.Cancel();
                    break;
                    
            case 8:   //Regular()
                    System.out.println("\n  Operation:  Regular()");
                    gp1.Regular();
                    break;
                    
            case 9:   //Diesel()
                    System.out.println("\n  Operation:  Diesel()");
                    gp1.Diesel();
                    break;
                    
            case 10:   //StartPump()
            	
                    System.out.println("\n  Operation:  StartPump()");
                    gp1.StartPump();
                    break;
                    
            case 11:   //PumpGallon()
                    System.out.println("\n  Operation:  PumpGallon()");
                    gp1.PumpGallon();
                    break;
                    
            case 12:   //StopPump()
                    System.out.println("\n  Operation:  StopPump()");
                    gp1.StopPump();
                    break;
                    
            case 13://FullTank()
            	System.out.println("\n  Operation:  FullTank()");
                gp1.FullTank();
                break;
                    
            default:  //Invalid choice
                    System.out.println("Invalid Choice");
                    break;

                }
	            
	        }
		}
		else if (input.equalsIgnoreCase("2"))
		{
            //Create GasPump1Factory, DataStore, OutputProcessor, MDAEFSM and GasPump1 objects
			AbstractFactory absfac = new GasPump2Factory();
			DataStore ds = absfac.getDataStore();
			OutputProcessor op = new OutputProcessor(absfac, ds);
			MDAEFSM mda = new MDAEFSM(op);
			GasPump2 gp2 = new GasPump2(mda, ds);

            System.out.println("*************************************");
            System.out.println("          Gas Pump-2" );	
            System.out.println("          MENU of Operations" );
            System.out.println("          1. Activate(a,b,c)" );
            System.out.println("          2. Start()" );
            System.out.println("          3. PayCash(c)" );
            System.out.println("          4. PayCredit()" );
            System.out.println("          5. Approved()" );
            System.out.println("          6. Reject()" );
            System.out.println("          7. Cancel()" );
            System.out.println("          8. Premium()" );
            System.out.println("          9. Regular()" );
            System.out.println("          10. Super()" );
            System.out.println("          11. StartPump()" );
            System.out.println("          12. PumpLiter()" );
            System.out.println("          13. Stop()" );
            System.out.println("          14. Receipt()" );
            System.out.println("          15. NoReceipt()" );
            System.out.println("          q. Quit" );	
            System.out.println("  Please make a note of these operations" );	  	    	
            System.out.println("           Gas Pump-2 Execution" );
            
            while(true)
            {
                System.out.println("  Select Operation: ");
                System.out.println("1-Activate,2-Start,3-PayCash,4-PayCredit,5-Approved,6-Reject,7-Cancel,8-Premium,9-Regular,10-Super,11-StartPump,12-PumpLiter,13-Stop,14-Receipt,15-NoReceipt,q-Quit");
                input = bufferedReader.readLine();
            	
	            if(input.isEmpty())
	            	continue;
	            if(input.equalsIgnoreCase("q"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	           // System.out.println("1-Activate,2-Start,3-PayCash,4-Cancel,5-Premium,6-Regular,7-Super,8-StartPump,9-PumpLiter,10-Stop,11-Receipt,12-NoReceipt,q-Quit");	            
	            switch(choice)
                {
                case 1:   //Activate(a,b,c)
                    float a,b,c;
                    System.out.println("\n  Operation:  Activate(int a, int b, int c)");
                    System.out.println("   Enter value of a:");
                    a = in.nextFloat();
                    System.out.println("   Enter value of b:");
                    b = in.nextFloat();
                    System.out.println("   Enter value of c:");
                    c = in.nextInt();
                    gp2.Activate(a,b,c);
                    break;
            
            case 2:   //Start()
                    System.out.println("\n  Operation:  Start()");
                    gp2.Start();
                    break;
                    
            case 3:   //PayCash(c)
                    float cash;
                    System.out.println("\n  Operation:  PayCash(int c)");
                    System.out.println("   Enter value of c:");
                    cash = in.nextFloat();
                    gp2.PayCash(cash);
                    break;
            
            case 4: //PayCredit()
            		System.out.println("\n  Operation:  PayCredit()");
            		gp2.PayCredit();
            		break;
            	
            case 5:   //Approved()
            		System.out.println("\n  Operation:  Approved()");
            		gp2.Approved();
            		break;        
        
            case 6: //Reject()
                	System.out.println("\n  Operation:  Reject()");
                	gp2.Reject();
                	break;
                	
            case 7: //Cancel()
                    System.out.println("\n  Operation:  Cancel()");
                    gp2.Cancel();
                    break;        
            
            case 8: //Premium()
                    System.out.println("\n  Operation:  Premium()");
                    gp2.Premium();
                    break;
                    
            case 9: //Regular()
                    System.out.println("\n  Operation:  Regular()");
                    gp2.Regular();
                    break;
                    
            case 10://Super()
                    System.out.println("\n  Operation:  Super()");
                    gp2.Super();
                    break;
                    
            case 11: //StartPump()
                    System.out.println("\n  Operation:  StartPump()");
                    gp2.StartPump();
                    break;
                    
            case 12://PumpLiter()
                    System.out.println("\n  Operation:  PumpLiter()");
                    gp2.PumpLiter();
                    break;
                    
            case 13://Stop()
                    System.out.println("\n  Operation:  Stop()");
                    gp2.Stop();
                    break;
                    
            case 14://Receipt()
                    System.out.println("\n  Operation:  Receipt()");
                    gp2.Receipt();
                    break;
                    
            case 15://NoReceipt()
                    System.out.println("\n  Operation:  NoReceipt()");
                    gp2.NoReceipt();
                    break;
                    
            default:  //Invalid choice
                    System.out.println("Invalid Choice");
                    break;

                }
            }
		}
		in.close();
	}

}
