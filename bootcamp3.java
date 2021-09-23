// print pattern look like Z
// if n= 5;





import java.util.Scanner;

public class bootcamp3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			if(i<=1) {
				while(j<=n) {
					System.out.print('*');
					j++;
			}}else if(i==n) {
				while(j<=n) {
					System.out.print('*');
					j++;
				}
			}else {
				while(j<n) {
					int k = n-i+1;
					if(j==k) {
						System.out.print('*');
						j++;
					}else {
						System.out.print(' ');
						j++;
					}
				}
			}
			System.out.println();
			i++;
			
		}
		
	}

}
