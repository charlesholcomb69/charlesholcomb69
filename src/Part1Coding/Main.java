package Part1Coding;


//Create an Interface 'Shape' with undefined methods
//as calculateArea and calculate Perimeter. Create 2
//classes Circle & Square that implements functionality
//defined in the Shape Interface. Test your code

interface Shape
{
    void input();
    void area();
}
class Circle implements Shape
{
    int r = 0;
    double pi = 3.14, ar = 0;
    @Override
    public void input()
    {
        r = 5;
    }
    @Override
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
}
class Square extends Circle
{
    int l = 0, b = 0;
    double ar;
    public void input()
    {
        super.input();
        l = 4;
        b = 4;
    }
    public void area()
    {
        super.area();
        ar = l * b;
        System.out.println("Area of Square:"+ar);
    }
}


public class Main {
    public static void main(String[] args)
    {
        Square obj = new Square ();
        obj.input();
        obj.area();
    }
}

