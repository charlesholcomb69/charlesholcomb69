package HashMapPractice;

import java.util.HashMap;

public class ExampleOne {
    public static void main ( String[] args ) {
        HashMap<String,Integer> map1=new HashMap<String,Integer> ();
        HashMap<String,Integer> map2=new HashMap<String,Integer> (30);
        HashMap<String,Integer> map3=new HashMap<String,Integer> (30,0.5f);
        HashMap<String,Integer>map4=new HashMap<String,Integer> (map1);

    }
}
