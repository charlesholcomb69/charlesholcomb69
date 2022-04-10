package ReviewClass11;

public class Animal {
    void Sleep(){
        System.out.println("Animals sleep");
    }
}
class Dog extends Animal{
    void Sleep(){
        System.out.println("Dog sleeps in the day");
    }
}

class Cat extends Animal{
    void Sleep(){
        System.out.println("Cat sleeps all the day");
    }
    void eat(){
        System.out.println("we like to eat fish");
    }
}

class Test2{
    public static void main(String[] args) {
        // Cat cat=new Dog();
        //  Cat cat=new Animal(); down casting
        Animal animal=new Cat(); // upcasting
        animal.Sleep();
        // animal.eat(); we can't use the methods that are specific to cat class only because right now it is behaving as an animal
        // Dog dog=(Dog)animal;
        // dog.Sleep();
        method(new Cat());

    }

    public static void method(Animal animal){
        if(animal instanceof Cat){
            ((Cat)animal).eat();
        }else {
            System.out.println("you are not passing a cat inside the box animal");
        }

    }
}