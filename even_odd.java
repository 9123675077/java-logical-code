package if_else;

import java.util.Scanner;


public class even_odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int rem = no % 2;
		if (rem == 0) {
			System.out.print("even");
//			return;
		}else {
			System.out.print("odd");
		}

	}

}
