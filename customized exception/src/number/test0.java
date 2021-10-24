package number;

import java.util.Scanner;

public class test0 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=scn.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println(n+"is a prime number");
		else
			System.out.println(n+"is not a prime number");

	}

}
