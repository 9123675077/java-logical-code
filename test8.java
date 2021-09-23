import java.util.Scanner;
public class test8 {

		 private static int power(int x, int n) {
				if (n == 0)
		            return 1;
		        else if (n % 2 == 0)
		            return power(x, n / 2) * power(x, n / 2);
		        else
		            return x * power(x, n / 2) * power(x, n / 2);
				
			}
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
		        int x = s.nextInt();
		        int n = s.nextInt();
		        System.out.printf("%d", power(x, n));
	}

}
