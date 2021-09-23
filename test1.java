import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        
	        String ip = s.next();
			char a = ip.charAt(0);
	        int ch =a;
			
	        
			if( ch>=65&&ch<=90 ) {
				System.out.print("1");
			}else if( ch>=97&&ch<=122 ) {
					System.out.print("0");
					}else {
						System.out.print("-1");
					}

		
	}

}
