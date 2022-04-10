package Class12;

public class Greeting {

	void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	void sayHelloManyTimes(String name) {
		for(int i=0;i<5;i++) {
			System.out.println("Hello " + name);
		}
	}
	
	void sayHelloNNumberOfTimes(String name,int times) {
		for(int i=0;i<times;i++) {
			System.out.println("Hello " + name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeter = new Greeting();
		greeter.sayHelloNNumberOfTimes("Emili",10);
		greeter.sayHello("Mike");
	}

}
