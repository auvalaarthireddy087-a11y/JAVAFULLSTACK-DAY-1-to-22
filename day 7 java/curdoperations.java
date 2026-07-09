import java.util.*;

public class Demo{

    public static void main(String args[]){

        ArrayList<String> list=new ArrayList<>();

        // Create
        list.add("Java");
        list.add("Python");

        // Read
        System.out.println(list);

        // Update
        list.set(1,"C++");

        // Delete
        list.remove(0);

        System.out.println(list);
    }
}