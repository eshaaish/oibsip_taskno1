import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int ma = 100;
        int mi = 1;
        int r = ma - mi + 1;
        int anonymous = (int)(Math.random() * r) + mi;
        int guess, nguesses=1;
        	do{
		System.out.println("guess the no. between 1 and 100\n");
		guess=sc.nextInt();
		if(guess>anonymous){
		System.out.println("lower number please\n");}
		else if(guess<anonymous){
			System.out.println("higher number please\n");
		
		}
		else {
		System.out.println("you guessed it in attempts\n"+nguesses);
		}
		nguesses++;
	}while(guess!=anonymous);
        
        
	}
}
