import java.util.Scanner;
public class test9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        int p = 0;
       
        while(i<=n){
            int j=1;
            int no = i;
            while(j<=n-i){
				System.out.print(' ');
                j++;
            }
            j = 1;
            while(j<=i){
                System.out.print(no);
                j++;
                no++;
            } 
            j=1;
            
            int k;
            k=p;
            while(j<=i-1) {
            	System.out.print(k);
            	k--;
            	
            	j++;
            }
          i ++;
          p=p+2;
          System.out.println();

        }

	}

}
