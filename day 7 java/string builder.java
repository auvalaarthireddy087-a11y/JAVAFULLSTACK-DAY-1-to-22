public class Demo{

    public static void main(String args[]){

        StringBuilder sb=new StringBuilder("Java");

        sb.append(" Programming");

        sb.insert(4," Language");

        sb.replace(0,4,"Python");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);
    }
}