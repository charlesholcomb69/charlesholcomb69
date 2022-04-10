package Class02;

public class Differences {
    public static void main(String[] args) {
        String a="Hello";
        String b="Bye";
        int c=10;
        int d=20;
        int sum=c+d;
        System.out.println(c+d+a+b);//30HelloBye
        System.out.println(a+b+c+d);//HelloBye1020
        System.out.println(a+b+(c+d)); //HelloBye30
        int num=123;
        String num2="123";
        String what=num+num2;
        System.out.println(what); //123123
        System.out.println(num+num2);//123123
    }
}
