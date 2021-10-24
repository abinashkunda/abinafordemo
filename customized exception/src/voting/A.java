package voting;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the age");
		int age=scn.nextInt();
		if(age>60)
			throw new TooOldException("no use of getting married");
		else if(age<18)
			throw new TooYoungException("thero zara sabar karo");
			else
				System.out.println("correct time ti get married");
			}
		}
		class TooYoungException extends RuntimeException
		{
			TooYoungException(String S)
			{
			}
		}
		class TooOldException extends RuntimeException
		{
			TooOldException(String S){
			}
		}
			
