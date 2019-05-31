


public class Equities {
    
    private String Symbols;
    private int T_Code; //This stores the integer user inputs for type;
    private int Shares;
    
    private String Name;
    private String Type;
    private double Current_Price;
    private double Open_Price;
    private double Close_Price;
    private double Dividend_Yield;
    private double Dividend_Amount;
    private double Pay_Rate;
    private String Last_Trade_D;
    private double High_Price;
    private double Low_Price;
    
    public Equities()
    {
        Symbols = ""; T_Code = -1; Shares = 0;
        Name = "";  Type = "";  Current_Price = 0.0; 
      Open_Price = 0.0;  Dividend_Yield = 0.0;
      Dividend_Amount = 0.0; Pay_Rate = 0.0;
      Last_Trade_D = ""; High_Price = 0.0; Low_Price = 0.0;
    }
    
    public Equities(String str, int tp, int shrs)
    {
        Symbols = str; T_Code = tp; Shares = shrs;
        
    }
    
    //The following are setters
    
    private void setName(String str){Name = str;}
    
    private void setType(int tp){String str = ""; Type = str;}
    
    private void setCurrent_Price(){}
    
    private void setOpen_Price(){}
    
    private void setClose_Price(){}
    
    private void setDividend_Yield(){}
    
    private void setDividend_Amount(){}
    
    private void setPay_Rate(){}
    
    private void setLTDate(){}
    
    private void setHigh_Price(){}
    
    private void setLow_Price(){}
    
    //The following are getters
    
    private String getName(){return Name;}
    
    private String getType(){return Type;}
    
    private double getCurrent_Price(){return Current_Price;}
    
    private double getOpen_Price(){return Open_Price;}
    
    private double getClose_Price(){return Close_Price;}
    
    private double getDividend_Yield(){return Dividend_Yield;}
    
    private double getDividend_Amount(){return Dividend_Amount;}
    
    private double getPay_Rate(){return Pay_Rate;}
    
    private String getLTDate(){return Last_Trade_D;}
    
    private double getHigh_Price(){return High_Price;}
    
    private double getLow_Price(){return Low_Price;}
}
