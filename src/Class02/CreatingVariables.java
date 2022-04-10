package Class02;

public class CreatingVariables {
    public static void main ( String[] args ) {
        /* create a variable and assign value
         *
         * declare a variable and initialize
         */
//1
        int age = 25;
//2
        int num; //declare variable
        num = 10; //initialize it
        num = 100;//reassign the value
        int n1, n2, n3; //all 3 variables are on the int type
        n1 = 10;
        n2 = 20;
        n3 = 26;
// cmd+d --> will remove entire line
// ctrl+d --> will remove entire line
//Can I change a value of the variable?
        age = 26; //reassigning the value of variable age
//age =26.5; ERROR: age variable can hold only int value
        age = 57;
        age = 75;
        System.out.println ( age );
        age = 100;
//Java Rules for identifiers
//boolean break=false; ERROR --> 1. do not use keyword as identifier
       // (name)
// char 1character='A'; ERROR --> 2. do not start identifier (name)
               // with numbers
// or special
               // characters
//double %value=12.99; ERROR --> 2. do not start identifier (name) with
       // special characters
//Java allows to use _ OR $ as identifier
        double $price = 1.99;
        double _value = 2.99;
        char character1 = 'a';
        boolean Break = true;
//not rules, but we prefer to follow
        /* variable and methods names should start with lowercase
         * give variable a meaningful name
         *
         * class name should start with upper case
         *
         * if name has 2 or more words --> follow camel casing
         */
        int bigNumber =132425;
    }
}
