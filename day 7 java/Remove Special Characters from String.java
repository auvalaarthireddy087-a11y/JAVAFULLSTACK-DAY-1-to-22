public class Demo{

    public static void main(String args[]){

        String str="Ja@va#12$3";

        String result=str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(result);
    }
}