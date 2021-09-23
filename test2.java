import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int res = 0;
        
        while(i<=n){
        	if(i % 2 == 0) {
        		res = res + i;
        	}
        	i = i+1;
        }
        System.out.println(res);
	}

}
