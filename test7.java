import java.util.Scanner;
public class test7 {

	public static void main(String[] args) {
		int rem,odd=0,even=0,digit,input;
		  Scanner s = new Scanner (System.in);
		  int num = s.nextInt();
		  
		 
		  
		  
		   while(num>0)
		   {
		             digit = num % 10;
		             
		             num = num / 10;
		             
		             rem = digit % 2;
		             
		             if(rem != 0)
		              
		             odd=odd+digit;
		             
		             else
		              
		             even=even+digit;
		         }
		   System.out.print(even+" "+odd);

	}

}
