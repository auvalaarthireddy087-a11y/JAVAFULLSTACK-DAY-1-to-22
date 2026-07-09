import java.util.*;

public class Demo{

    public static void main(String args[]){

        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();

        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Orange");

        System.out.println(map);
    }
}