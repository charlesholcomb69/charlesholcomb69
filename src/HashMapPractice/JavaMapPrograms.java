package HashMapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMapPrograms{
    public static void main ( String[] args ) {
        HashMap<String,Integer>map=new HashMap<String,Integer> ();
        map.put ( "One",1 );
        map.put ( "Two",2 );
        map.put ( "Three",3 );
        map.put ( "Four",4 );
        map.put ( "Five",5 );
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet ();
        for (Map.Entry<String,Integer>entry:entrySet){
            System.out.println (entry.getKey ()+" : "+entry.getValue () );

        }
        System.out.println ("------------------" );
        HashMap<String,Integer>AnotherMap=new HashMap<String,Integer> ();
        AnotherMap.put ( "Six",6 );
        AnotherMap.put("Seven", 7);
        AnotherMap.putAll(map);
        entrySet = AnotherMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }
}
