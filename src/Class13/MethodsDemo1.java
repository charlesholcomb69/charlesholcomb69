package Class13;

import java.util.Scanner;

public class MethodsDemo1 {

	// void is type of methods that don't return anything when called
	//checkEvenOdd is the name of the method
	//() we use to pass information from outside
	//int number this is parameter that we can pass to this method when called 
	// we can use this variable inside the logic of method
	void checkEvenOdd(int number) {
		if(number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}

	}
	void edward( boolean isRaining) {
		if(isRaining) {
			System.out.println("i am staying home");
		}else {
			System.out.println("lets go for a walk");
		}
	}
	// create a method to check a name if name is Teyfur it prints 
	//send memes otherwise if name is Name is Maha prints i am a doctor
	//prints i don't know you
	
	void checkPerson(String name) {
		if("Teyfur".equals(name)) {
			System.out.println("Memer");
		}else if("Maha".equals(name)) {
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown");
		}
	}
	
	public static void main(String[] args) {
		
		MethodsDemo1 object1=new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		object1.edward(false);
		
		object1.checkPerson("Teyfur");
		object1.checkPerson("Maha");
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		//int number2=object1.checkEvenOdd(120);
		
		
	}

    public static class MethodsDemo2 {


        //create a method that takes an animal name and person name if name is equal to Teyfur and animal is Horse
        //print camel otherwise print horse
        void TeyfurAndHorse(String personName,String animalName) {
            if("Teyfur".equalsIgnoreCase(personName)&& "Horse".equalsIgnoreCase(animalName)) {
                System.out.println("This is a camel");
            }else if("Horse".equalsIgnoreCase(animalName)){
                System.out.println("This is a Horse");
            }
        }


        public static void main(String[] args) {
            MethodsDemo2 obj=new MethodsDemo2();
            obj.TeyfurAndHorse("Teyfur", "Horse");
            obj.TeyfurAndHorse("Tarik", "Horse");
        }

    }
}
