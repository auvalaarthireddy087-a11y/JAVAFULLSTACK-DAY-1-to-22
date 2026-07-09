import java.util.*;

public class Demo{
    public static void main(String args[]){

        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Arthi");
        map.put(2,"Reddy");
        map.put(3,"Java");

        System.out.println(map);

        System.out.println(map.get(2));

        map.remove(3);

        System.out.println(map);
    }
}