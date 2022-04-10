package Class15;

public class Task2 {

	public static void main(String[] args) {
	
		String father="Dan";
		String mother="Mariam";
		String expectation="boy";
		String firstPart="";
		String secondPart="";
		if(expectation.equalsIgnoreCase("boy")) {
			firstPart=father.substring(0,father.length()/2);
			secondPart=mother.substring(mother.length()/2);
		}else if(expectation.equalsIgnoreCase("girl")){
			
			firstPart=mother.substring(0,mother.length()/2);
			secondPart=father.substring(father.length()/2);
		}
		System.out.println(firstPart+secondPart);
	}

}
