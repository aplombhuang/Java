
/**
 * @Note: CMSC 409 FINAL
 * @ QUESTION 2.2 Bayes classifier
 * @author APLOMB
 */
public class Final 
{
    public static void main(String[] args) 
    {
      double [] trn_inArray  = 
      {
          -1.9242,-2.0039,-2.0259,-1.8096,-1.9083,-1.8787,-1.7109,-2.0123,-1.843,-1.6965,-2.029,-1.6988,
          -1.988,-2.0222,-1.843,-1.6487,-1.9318,-2.0404,-1.9948,-1.7147,-2.177,-1.8036,-1.7398,-2.2917,
          -2.1064,-1.4179,-2.1504,-1.6464,-1.6957,-1.7102,-1.9,-1.5666,-1.7876,-1.8385,-1.9849,
          0.53616,0.56647,0.50042,0.31371,0.61207,0.93016,0.27571,0.14968,0.2886,0.3646,0.19066,0.56111,
          0.38657,0.46556,0.73196,0.29241,0.43668,0.48904,0.4025,0.59754,0.64773,-0.11823,0.054031,0.62114,
          0.88158,0.44962,0.36004,-0.078029,0.57179,0.60448,0.87775,0.66516,1.1244,0.29769,0.63864,0.32963,
          1.1139,1.1449,1.5837,1.7038,1.192,1.6529,1.3052,2.2981,1.3196,1.3439,1.3795,1.5595,1.6977,1.2672,
          1.4191,1.719,1.6339,1.4335,1.4942,1.574,1.8973,0.95286,1.2848,1.3795,1.4198,1.476,1.4578,1.0235,
          1.6362,1.9649,1.249,1.246,1.306,1.2731,1.2999,1.7061,1.857,1.719,1.1715,1.7053,1.1707,
      };
      
      int [] trn_outArray = 
      {   1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
          2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,  
          3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
      
      // the above is just reconstructing training data
     
      double pci_1 = 0,  pci_2 = 0,  pci_3 = 0; // probability of class 1, class 2, class 3 
      double mean_1 = 0, mean_2 = 0, mean_3 = 0;
      double std_1 = 0, std_2 = 0, std_3 = 0;
      int temp = 0; double  c1 = 0, c2 = 0, c3 = 0; int select = 0;
      
      for(int i = 1; i<trn_outArray.length; i++)
      { temp = trn_outArray[i];
          if(trn_outArray[i-1]!=temp){  
          
          if(select ==0){c1 = i*1.0; pci_1 = c1/trn_outArray.length;  select ++; }
          else if(select ==1){c2 = i-c1; pci_2 = c2/trn_outArray.length; select ++; }
          }
      }
      c3 = trn_outArray.length - (c1 + c2); 
      pci_3 = c3/trn_outArray.length;     
    
      mean_1 = getMean(trn_inArray, 0,c1);
      
      mean_2 = getMean(trn_inArray, c1, c2);
      
      double m =  trn_inArray.length - c3;
        
      mean_3 = getMean(trn_inArray, m, c3);
  
      std_1 = calculateSD(trn_inArray, 0,c1);
      
      std_2 = calculateSD(trn_inArray, c1, c2);
      
      std_3 = calculateSD(trn_inArray, m, c3);
      
      double px1, px2,  px3; double prob1, prob2, prob3;
      
      System.out.println();
      
      for(double value:trn_inArray){px1 = getPxC(value, mean_1, std_1); System.out.println(value +", " + px1 +", Class1" );}
      
      System.out.println();
      
      for(double value:trn_inArray){px2 = getPxC(value, mean_2, std_2); System.out.println(value +", " + px2 +", Class2");}
      
       System.out.println();

      for(double value:trn_inArray){px3 = getPxC(value, mean_3, std_3); System.out.println(value +", " + px3 +", Class3");}
      
     double error1=0, error2=0, error3=0; int count1 =0,count2 =0, count3 =0;
     
     double[]testData = 
     {-1.9022,-2.2961,-1.6069,-2.1588,-2.3751,-2.0859,-1.9288,-1.8127,-1.9508,-2.4685,-1.7223,-1.8172,-1.8475,-1.881,-1.843,
         0.072255,0.095103,0.69098,0.61508,0.30084,0.24996,0.35469,0.52554,0.22412,0.27115,0.60516,0.31748,0.95971,0.48982,
         1.7166,1.3659,1.0213,1.6704,0.9871,1.577,1.0964,1.5792,1.4015};
     
     int[]testClass = 
     {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
      2,2,2,2,2,2,2,2,2,2,2,2,2,2,
      3,3,3,3,3,3,3,3,3};
     
     //reconstruct test data 
     
     select = 0;
     
      for(int i = 1; i<testClass.length; i++)
      { temp = testClass[i];
          if(testClass[i-1]!=temp){  
          
          if(select ==0){count1 = i;select ++; }
          else if(select ==1){count2 = i-count1; select ++; }
          }
      }
      count3 = testClass.length - (count1 + count2); 
      
      for(int i = 0; i<testClass.length; i++)
      {
          double value = testData[i]; 
          
          px1 = getPxC(value, mean_1, std_1); px2 = getPxC(value, mean_2, std_2); px3 = getPxC(value, mean_3, std_3);
        
          if(testClass[i]==1)
          {
              if(px1<px3 ){error1++;}
              else if(px1<px2){error1++;}
          }
          else if(testClass[i]==2)
          {
              if(px2<px3 ){error2++;}
             else if(px1>px2 ){error2++;}
          }
          else{if(px2>px3 ){error3++;}
             else if(px1>px3 ){error3++;}}
        
      }
      
      System.out.println("errer rate in class1 is: " + error1/count1);
      System.out.println("errer rate in class2 is: " + error2/count2);
      System.out.println("errer rate in class3 is: " + error3/count3);
      System.out.println("over all error rate is :" +(error1+error2+error3)/testData.length);
      
      
    }
    public static double calculateSD(double numArray[], double n1, double n2)
    {
        double sum = 0.0, standardDeviation = 0.0; double num;
        int length = (int)n2; int start = (int)n1;length = length + start;

        for(int i = start; i<length; i++) {  sum += numArray[i];   }

        double mean = sum/length;

       for(int i = start; i<length; i++){
        num = numArray[i];
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
    
    public static double getMean(double numArray[], double n1, double n2)
    {
        double sum = 0.0;  double num;
        
        int start = (int)n1;int length = (int)n2 ; int end = length + start;
        
        

        for(int i = start; i<end; i++) { sum += numArray[i];   }

        double mean = sum/length; 

        return mean;
    }
    
     public static double getPxC(double value, double mean, double std)
    {
        double prob = 0.0;
        
        prob = (1/std*Math.sqrt(2*Math.PI))*Math.exp(((-1)*(value - mean)*(value - mean))/(2*std*std));

        return prob;
    }
     
}
