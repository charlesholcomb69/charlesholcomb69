package Class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="       Moree   d         ";
		System.out.println(name);
		System.out.println(name.trim());
		
		String name2="Run Moreed";// a person who always fear his wife and is always obedient or submissive to his wife
		System.out.println(name2.toLowerCase().startsWith("run")); // method chaining
		System.out.println(name2.startsWith("Moreed"));
		System.out.println(name2.endsWith("Moreed"));
		System.out.println(name2.endsWith("d"));
		System.out.println(name2.toLowerCase().contains("m"));
		
		
		
	}

}
