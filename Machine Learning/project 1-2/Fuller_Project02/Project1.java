import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project1 
{
	public static void main(String [ ] args) throws FileNotFoundException
	{
		Scanner read = new Scanner (new File("data2.txt"));
		
		read.useDelimiter("\t");
		double height;
		double weight;
		int gender;
		int falsePositive=0; //determined to be male but is actually female
		int truePositive=0; //determined to be male and is actually male
		int trueNegative=0; //determined to be female and it actually female
		int falseNegative=0; //determined to be female but is actually male
		
		

		while (read.hasNext())
		{
			height = Double.parseDouble(read.next());
			weight = Double.parseDouble(read.next());

			String r = read.nextLine();
			String r2 = r.replaceAll("[,]","");
			r2 = r2.trim();
			gender = Integer.parseInt(r2);			
		   
		   //System.out.println(height +", " +weight+" , "+ gender);
		   
		   //determined to be male
		   if(height>0.0066*weight+4.7966)
		   {
			   //person is actually male
			   if(gender==0)
			   {
				   truePositive++;
			   }
			   //person is actually female
			   if(gender==1)
			   {
				   falsePositive++;
			   }
		   }
		   
		   //determined to be female
		   if(height<0.0066*weight+4.7966)
		   {
			   //person is actually male
			   if(gender==0)
			   {
				   falseNegative++;
			   }
			   //person is actually female
			   if(gender==1)
			   {
				   trueNegative++;
			   }
		   }
		 
		}
		System.out.println("True Positives: "+truePositive);
		System.out.println("True Negatives: "+trueNegative);
		System.out.println("False Positives: "+falsePositive);
		System.out.println("False Negatives: "+falseNegative);
		read.close();
	}
	
	

}
