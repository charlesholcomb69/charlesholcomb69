package ReviewClass11;

public class Parent {

    final String name="Anton";
    void method1() {
        //name="Asel"; can't chnage its values
        System.out.println("I likes mangoes");
    }

    public void method2() {
        System.out.println("Hello World");
    }
}

class Child extends Parent {
    //final String name1="Anton";
    @Override
    public void method1() {
        // name="Zulfiya";
        System.out.println("I like apples ");
    }
}



class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();

    }
}