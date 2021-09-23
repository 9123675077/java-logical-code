//Pattern for N = 5
//     ..*
//     .***
//     *****
//     .***
//     ..*
//
//
//

import java.util.Scanner;
public class test12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int j =1;
		
		while(i<=n) {
			 j=1;
			while(j<=n-2) {
				System.out.print(' ');
				j++;
			}
			j =1;
			while(j<=n) {
			if(j%2!=0){
				int k = 1;
				while(k<=j){
					System.out.print('A');
					k++;
				}}
			}
			i++;
			j++;
			System.out.println();
		}
	}
}
