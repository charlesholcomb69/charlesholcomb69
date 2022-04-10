package Class14;

public class Task3 {

	String sayHello(String country) {
		country=country.toLowerCase();
		switch(country) {
		case"usa":
			return "Hello";
		case "france":
			return "Bonjour";
		case "turkey":
			return "Merhaba";
		 default:
			 return "Zulfiya is very good and patience student who loves Silva";
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Create a method that will say Hello in different language based on the
		country that will passed when method is executed
		 */
		Task3 object=new Task3();
		String country=object.sayHello("Silva");
		System.out.println(country);
		
		//break till 8:47
		

	}

}
