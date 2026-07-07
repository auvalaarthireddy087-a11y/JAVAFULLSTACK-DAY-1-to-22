class Parent {
    String Fathersname = "sivaramachandrareddy";
    String Mothersname = "Anusha";
    public void Family() {
        System.out.println("Fathersname: " + Fathersname);
         System.out.println("Mothersname: " + Mothersname);
    }
}
class Child extends Parent {
    String Brothersname = "Nani";
    String Sistersname = "Sweety";
    public void displayInfo() {
        System.out.println("Brothers name: " + Brothersname);
        System.out.println("Sisters name: " + Sistersname);
    }
}
public class Main {
    public static void main(String[] args) {
        Child myChild = new Child();
        myChild.Family();
        myChild.displayInfo();
    }
}