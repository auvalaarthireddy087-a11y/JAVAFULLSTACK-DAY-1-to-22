import java.util.*;

public class Demo{

    public static void main(String args[]){

        HashMap<String,String> details=new HashMap<>();

        details.put("Name","Arthi");
        details.put("Age","20");
        details.put("College","XYZ College");
        details.put("Branch","IT");

        for(Map.Entry<String,String> entry:details.entrySet()){

            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}