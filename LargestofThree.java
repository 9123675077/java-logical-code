package if_else;

import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
//		if(a>=b && a>=c) {
//			System.out.print(a);
//		}else {
//			if(b>=a && b>=c) {
//				System.out.print(b);
//			}else {
//				if(c>=a && c>=b) {
//					System.out.print(c);
//				}
//			}
//		}
		
		//2nd part 
		if(a>=b && a>=c) {
			System.out.print(a);
		}else if(b>=a && b>=c) {
				System.out.print(b);
				}else if(c>=a && c>=b) {
					System.out.print(c);
				}
	}

}
