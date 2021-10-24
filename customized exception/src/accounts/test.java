package accounts;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {
		Scanner scn= new Scanner(System.in);
		String Acc=scn.nextString();
		String AccNo= args[0];
		String AccName=args[1];
		int pin_num=Integer.parseInt(args[2]);
		String AccType=args[3];
		System.out.println("account details");
		System.out.println("---------------");
		System.out.println("account number"+ AccNo);
		System.out.println("account name"+ AccName);
		System.out.println("account type"+ AccType);
		System.out.println("account Pin number"+ pin_num);
		if(pin_num>=1000&&pin_num<=9999)
			System.out.println("valid pin number");
		else
			throw new RuntimeException("invalid pin number enter 4 digit pin number");
	}
}

