import java.util.Arrays;

public class AllStringMethods {
    public static void main(String[] args) {

        //charAt()
        String str = "Arthi";
        char result = str.charAt(0);
        System.out.println(result); 

        //compareTo()
        String str1 = "A";
        String str2 = "B";
        int result = str1.compareTo(str2);
        System.out.println(result); 

        // compareToIgnoreCase()
        String str1 = "A";
        String str2 = "a";
        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);

        //concat()
        String str1 = "Hi ";
        String str2 = "Arthi";
        String result = str1.concat(str2);
        System.out.println(result);

        //contains()
        String str = "Hello";
        boolean result = str.contains("el");
        System.out.println(result);

        //contentEquals()
        String str = "Hello";
        boolean result6 = str.contentEquals("Hello");
        System.out.println(result);

        //copyValueOf()
        char[] array = {'a', 'b'};
        String result = String.copyValueOf(array);
        System.out.println(result);

        //endsWith()
        String str = "photo.png";
        boolean result = str.endsWith(".png");
        System.out.println(result);

        //equals()
        String str1 = "cat";
        String str2 = "cat";
        boolean result = str1.equals(str2);
        System.out.println(result);

        //equalsIgnoreCase()
        String str1 = "CAT";
        String str2 = "cat";
        boolean result10 = str1.equalsIgnoreCase(str2);
        System.out.println(result);

        //indexOf()
        String str = "Apple";
        int result = str.indexOf("p");
        System.out.println(result);

        //isEmpty()
        String str = "";
        boolean result = str.isEmpty();
        System.out.println(result);

        //join()
        String result = String.join("-", "A", "B");
        System.out.println(result);

        //lastIndexOf()
        String str = "Hello";
        int result = str.lastIndexOf("l");
        System.out.println(result);

        //matches()
        String str = "123";
        boolean result = str.matches("\\d+");
        System.out.println(result);

        //replace()
        String str = "ball";
        String result = str.replace('b', 'c');
        System.out.println(result);

        //replaceAll()
        String str = "A1B2";
        String result = str.replaceAll("\\d", "X");
        System.out.println(result);

        //replaceFirst()
        String str = "cat cat";
        String result = str.replaceFirst("cat", "dog");
        System.out.println(result);

        //split()
        String str = "A-B";
        String[] result = str.split("-");
        System.out.println(Arrays.toString(result));

        //startsWith()
        String str = "Java";
        boolean result = str.startsWith("Ja");
        System.out.println(result);

        //subSequence()
        String str = "Watermelon";
        CharSequence result = str.subSequence(0, 5);
        System.out.println(result);

        //substring()
        String str = "Sunshine";
        String result = str.substring(3);
        System.out.println(result);

        //toCharArray()
        String str = "Hey";
        char[] result = str.toCharArray();
        System.out.println(Arrays.toString(result));

        //toLowerCase()
        String str = "JAVA";
        String result = str.toLowerCase();
        System.out.println(result);

        //toUpperCase()
        String str = "java";
        String result = str.toUpperCase();
        System.out.println(result);

        //toString()
        String str = "Hello";
        String result = str.toString();
        System.out.println(result);

        //trim()
        String str = "  hi  ";
        String result = str.trim();
        System.out.println(result); 

        //valueOf()
        int value = 100;
        String result = String.valueOf(value);
        System.out.println(result); 
    }
}