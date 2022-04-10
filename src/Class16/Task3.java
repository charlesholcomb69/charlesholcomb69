package Class16;



public class Task3 {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        //String class method to count the number of characters in a class
        System.out.println(a.length());
        // length property that we can use to check the number of elements in a array
        System.out.println(a.split("[?.!]").length);
        int[] arr={10,10};
        System.out.println(arr.length);

        Task3 task3=new Task3();
        System.out.println(task3.method(arr).length);
    }


    String [] method(int [] numbers){
       String [] stringArr=new String[numbers.length];
        return stringArr;
    }
}
