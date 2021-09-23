package if_else;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ip = s.next();
		char a = ip.charAt(0);
		int b =a;
		int i=65;
		int j=90;
		int k=97;
		int l=122;
		int m=33;
		int n=64;
		
		if(i<= a >=j) {
			System.out.print("1");
		}else if( k>= a <=l ) {
				System.out.print("0");
				}else if( m>= a <=n ) {
					System.out.print("-1");
				}
        	
        

	}

}
