package Class15;

public class Task4 {

	public static void main(String[] args) {
	
		String str="Sunday";
		String reversedStr="";
		for(int i=str.length()-1;i>=0;i--) {
			reversedStr=reversedStr+str.charAt(i);
		}
		System.out.println(reversedStr);

	}

}
