public class TC 
{
  public double converTemp( double temp, String inUnit, String outUnit)throws Exception
  {
    // 
    inUnit = normalizeScale(inUnit);
    // 
    outUnit = normalizeScale(outUnit);
    
    return 0.0; //incomplete
  }
  
  private String normalizeScale(String inScale)throws Exception
  {
    if (null == inScale){
      //
     throw new Exception ("inScale is null.");
      
    }
    return "celsius"; //INCOMPLETE
  }
} // end class TC