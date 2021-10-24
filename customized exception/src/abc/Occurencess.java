package abc;

public class Occurencess {

	public static void main(String[] args) {
		String str="i love coding and testing";
		
		int count=0;
		for(char ch: str.toCharArray()) {
			if(ch=='i') {
				count++;
			}
		}
            System.out.println(count);
	}

}
