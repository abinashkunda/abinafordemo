package accounts;

import java.util.ArrayList;

public class addition {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("a");
		l.add(10);
		l.add("a");
		l.add(null);
		System.out.println(l);
		l.add(2, "Z");
		System.out.println(l);
		System.out.println(l.get(3));
	}

}
