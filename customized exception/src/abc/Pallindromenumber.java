package abc;

public class Pallindromenumber {
	public static void isPallindromeNumber(int num) {
		int r=0;
		int sum=0;
		int t;
		t=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("pallindrome number");
		}else {
			System.out.println("not pallindrome number");
		}
	}

	public static void main(String[] args) {
		isPallindromeNumber(152);

	}

}
