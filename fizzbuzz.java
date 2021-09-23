import java.util.Scanner;
public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        while(i<=n){
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz");
            }else if(i%3==0){
                System.out.print("Fizz");
            }else if(i%5==0){
                System.out.print("Buzz");
            }else{
                System.out.print(i); 
            }   
            System.out.println();
            i++;
	}

}
}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//class Result {
//
//    /*
//     * Complete the 'fizzBuzz' function below.
//     *
//     * The function accepts INTEGER n as parameter.
//     */
//
//    public static void fizzBuzz(int n) {
//        
//    int i = 1;
//        
//        while(i<=n){
//            if(i%3==0 && i%5==0){
//                System.out.print("FizzBuzz");
//            }else if(i%3==0){
//                System.out.print("Fizz");
//            }else if(i%5==0){
//                System.out.print("Buzz");
//            }else{
//                System.out.print(i); 
//            }   
//            System.out.println();
//            i++;
//    }
//
//    }
//
//}
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//        
//        Result.fizzBuzz(n);
//
//        bufferedReader.close();
//    }
//}

