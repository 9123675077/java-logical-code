import java.util.Scanner;
public class test {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        
        int st = s.nextInt();
        int ed = s.nextInt();
        int wd = s.nextInt();
		 
        while(st<=ed){
            int c = (5*(st-32))/9;
            System.out.println(st + "  "+ c);
            st = st + wd;    
        }

	}

}
