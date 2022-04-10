package HashMapPractice;


import java.util.HashMap;

public class JavaHashMapPrograms1 {
    public static void main ( String[] args ) {




            HashMap<Integer,String> map = new HashMap<Integer, String>();


            map.put(1, "Google");
            map.put(2, "Syntax");
            map.put(3, "MicroSoft");
            map.put(4, "Toshiba");
            map.put(5, "Ford");
            map.put(6, "Ford");
            map.put(5, "Sony");
            map.put(7, "StarBucks");
            map.put(1, "Macey's");

        System.out.println(map.size());
        System.out.println(map);




        map.replace(3, "Target");

        System.out.println(map);


        map.remove(7);
        System.out.println(map);




            }
        }


