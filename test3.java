import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int i,k;
		for(i=1;i<=n;i++) {
			for(k=i;k<=i+(i-1);k++) {
				System.out.print(k);
			}
			System.out.println(" ");
		}

	}

}
