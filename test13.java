import java.util.Scanner;
public class test13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int L = in .nextInt();
		 	if(L<=1) {
		 		System.out.print('*');
		 	}
		 	else if ((L % 2) != 0) {
	                int add = 1;
	                int numOfSpaces = L / 2;
	                for (int i = 1; i <= L; i++) {
	                    for (int j = numOfSpaces; j >= 1; j--) {
	                        System.out.print(" ");
	                    }
	                    for (int j = 1; j <= add; j++) {
	                        System.out.print("*");
	                    }
	                    System.out.println();
	                    if (i < (L / 2 + 1)) {
	                        add = add + 2;
	                        numOfSpaces = numOfSpaces - 1;
	                    } else {
	                        add = add - 2;
	                        numOfSpaces = numOfSpaces + 1;
	                    }
	                }
		 	}
//	            } else {
//	                int add = 1;
//	                int numOfSpaces = L / 2;
//	                for (int i = 0; i <= L + 1; i++) {
//	                    for (int j = numOfSpaces; j >= 1; j--) {
//	                        System.out.print(" ");
//	                    }
//	                    for (int j = 1; j <= add - 2; j++) {
//	                        System.out.print("*");
//	                    }
//	                    System.out.println();
//	                    if (i < (L / 2 + 1)) {
//	                        add = add + 2;
//	                        numOfSpaces = numOfSpaces - 1;
//	                    } else {
//	                        add = add - 2;
//	                        numOfSpaces = numOfSpaces + 1;
//	                    }
//	                }
//	            }
	        
	    }
	}