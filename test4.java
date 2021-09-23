import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int i,j,sp;
		for(i=1;i<=n;i++) {
            for(sp=1;sp<=n-i;sp++){
			System.out.print(" ");
          }   
            for(j=i;j<=i+(i-1);j++) {
				System.out.print(j);
			}
			System.out.println(" ");
        }

	}

}
