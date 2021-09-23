import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
        int bs = s.nextInt(); // bs = Basic Salary
        String ch = s.next();
        float hr = (bs*20)/100f;
        float da = (bs*50)/100f;
        float pf = (bs*11)/100f;
		if(ch.equals("A")){
            ch = "1700";
        }
        else if(ch.equals("B")){
            ch = "1500";
        }
        else if(ch.equals("C")){
        	ch = "1300";
        }
        else if(ch.equals("P")){
        	ch = "1300";
        }
        else if(ch.equals("K")){
        	ch = "1300";
        }
        else{
            System.out.print("enter character is wrong");
        }
		int i=Integer.parseInt(ch);  
			float Ts = (bs+hr+da+i)-pf;
			int j;
			j=(int)Ts;
			float k = Ts-j;
			if (k>0.50) {
				int r = j+1;
				System.out.println(r);
			}else {
				System.out.println(j);
			}

	}

}
