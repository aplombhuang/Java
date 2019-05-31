/*@Programmer: APLOMB TR HUANG
 * @Course: CSC 202
 * @Instructor: GEORGE CARDWELL
 * @Program Project #1
 */

public class Equity {
	//Instance variables:
	private String Ticker;
	private String Name;
	private int Shares;
	private int Equity_Type;
	private String Exchange;
	private double Current_Price;
	private double Est_yr;
	private double Dividend_yield;
	private int Payment_cycle;
	private double Dividend_amount;
	private double Current_Value;
	private double NYr_Value;
	
	private double holdings;
	
	public static void main (String [] args)
	{
		printHeading();
		
		Equity Company1 = new Equity("XOM", "Exon Mobil Co", 200 , 0 ,"NYSE" , 81.34, 4 ,3.35 , 4 );
		Equity Company2 = new Equity("D", "Dominion Resources Inc", 50 , 0 , "NYSE" , 73.41 , 2 , 3.58 ,4);
		Equity Company3 = new Equity("O", "Realty Income Corp.", 100 , 2 , "NYSE" , 45.66 , 3.5 , 4.78 ,12);
		Equity Company4 = new Equity("XLU", "Utilities Select Sector SPDR Fund", 250, 1, "AMEX", 47.87 , 1.5 , 3.13 , 4);
		Equity Company5 = new Equity("AAPL", "Apple Inc", 100, 0, "NASD", 112.66 , 5 , 1.59 , 4);
		
		
		System.out.println(Company1.toString());
		System.out.println(Company2.toString());
		System.out.println(Company3.toString());
		System.out.println(Company4.toString());
		System.out.println(Company5.toString());
		
		double sum1 = Company1.getCurrent_Value() + Company2.getCurrent_Value() + Company3.getCurrent_Value() +  Company4.getCurrent_Value() + Company5.getCurrent_Value();
		double sum2 = Company1.getHoldings(5) + Company2.getHoldings(5) + Company3.getHoldings(5) + Company4.getHoldings(5) + Company5.getHoldings(5);
		double sum3 = Company1.getHoldings(10) + Company2.getHoldings(10) + Company3.getHoldings(10) + Company4.getHoldings(10) + Company5.getHoldings(10);
		
		System.out.println("Totall Current Value of all shares is: $" + sum1 );
		System.out.println("Totall Value of all shares in 5 years is: $" + sum2 );
		System.out.println("Totall Value of all shares in 10 years is: $" + sum3 );
		
		
	}
	
	private static void printHeading()
	{
		System.out.println("My name is Aplomb TR Huang. My student ID #: 6856925.");
		System.out.println("This is class CSC 202-Fall 2016.");
		System.out.println("\n   Equity Report \n");
	}
	
	public Equity()//This is default constructor;
	{
	 Ticker = ""; Name = "";  Exchange = "";
	 Shares = 0; Equity_Type = -1; Payment_cycle = 0;
	 Current_Price = 0.0; Est_yr = 0.0; Dividend_yield = 0.0;
	 Dividend_amount = 0.0; Current_Value = 0.0; NYr_Value = 0.0;
	 
	}
	
	public Equity(String TS, String EN, int NS, int ET, String EX, double CEP, double EYI, double DY, int PC )//This is constructor with parameter;
	{
	 Ticker = TS; Name = EN;  Exchange = EX;
	 Shares = NS; Equity_Type = ET; Payment_cycle = PC;
	 Current_Price = CEP; Est_yr = EYI; Dividend_yield = DY;
	 setCurrent_Value(); 
	 
	}
	
	
	public String toString()
	{
		String str = "Equity ticker symbol: " + this.Ticker + "\nEquity Name: " + this.Name + "\nEquity Type: " + this.getEquity_Type() 
		              + "\nCurrent price per share: $" + this.Current_Price+ "\nNumber of shares held: " + this.Shares 
				      + "\nCalculated current value: $" + this.Current_Value 
				      + "\nEstimated increase in share price per year in percent: " + this.Est_yr + "%"
				      + "\nEstimated value of shares held in 5 years: $" + this.getHoldings(5)
				      + "\nEstimated value of shares held in 10 years: $" + this.getHoldings(10)
				      + "\n";
		
		return str;
	}
	
	// getter sets
	
	public String getTicker()	{ return Ticker; }
	
	public String getName()	{ return Name;	}
	
	public int getShares(){return Shares;}
	
	public String getEquity_Type()
	{  String str;
		if (Equity_Type == 0){str = "Stock";}
		else if(Equity_Type == 1){str = "ETF";}
		else if(Equity_Type == 2){str = "REIT";}
		else if(Equity_Type == -1){str = "default";}
		else {str = "data error";}
		return str;}
	
	public String getExchange(){return Exchange;}
	
	public double getCurrent_Price(){return Current_Price;}
	
	public double getEst_yr(){return Est_yr;}
	
	public double getDividend_yield() { return Dividend_yield;}
	
	public int getPayment_cycle(){return Payment_cycle; }
	
	public double getDivident_amount() {return Dividend_amount;}
	
	public double getCurrent_Value(){return Current_Value;}
	
	public double getNYr_Value() {return NYr_Value;}
	
	public double getHoldings(int yrs){setHoldings(yrs);return holdings;};
	
	
	// setter sets
	
    public void setTicker(String TS){ Ticker = TS;  }
	
	public void setName(String EN){ Name = EN;  }
	
	public void setShares(int NS){ Shares = NS;  }
	
	public void setEquity_Type(int ET){ Equity_Type = ET;  }
	
	public void setExchange(String EX){ Exchange = EX;  }
	
	public void setCurrent_Price(double CEP){ Current_Price = CEP;  }
	
	public void setEst_yr(double EYI){ Est_yr = EYI;  }
	
	public void setDividend_yield(double DY){ Dividend_yield = DY;   }
	
	public void setPayment_cycle(int PC){ Payment_cycle = PC;  }

    private void setCurrent_Value(){Current_Value = Current_Price * Shares;}
    
    private void setDividend_amount(int yrs)
    {double percent = 1 + this.Est_yr /100; int nYrs = yrs -1;
    	Dividend_amount = (this.Current_Price * Math.pow(percent, nYrs)* Dividend_yield)/Payment_cycle;}
    
    public void setHoldings(int yrs)
    {  double percent = 1 + this.Est_yr /100; double payment = 0.0; int nYrs = 10 - yrs;
        
    while (nYrs != yrs){
    
    	    payment = payment + this.Current_Price * Math.pow(percent, nYrs)* this.Dividend_yield;
    	    
    	    nYrs ++;
    }
    holdings =  this.Shares * this.Current_Price * Math.pow(percent, yrs) + payment;
       
    }
       
}
