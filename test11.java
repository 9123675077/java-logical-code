//drawn like 
//
//n=4
//		 1
// 		121
//	   12321
//	  1234321
//     12321
//      121
//       1







import java.util.Scanner;
public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int j = 1;
			while(j<=n-i)
			{
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			j=1;
			int k = i-1;
			while(j<=i-1)
			{
				System.out.print(k);
				j++;
				k--;
			}
			i++;
			System.out.println();
		}
		i=1;
		while(i<=n-1) {
			int j=1;
			while(j<=i) {
				System.out.print(" ");
				j++;
			}
			while(j<=i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n-i) {
				System.out.print(j);
				j++;
			}
			j=1;
			int k = n-i-1;
			while(j<=n-i-1) {
				System.out.print(k);
				k--;
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
