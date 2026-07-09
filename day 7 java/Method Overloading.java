class Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String args[]) {
        Calculator obj = new Calculator();

        obj.add(10,20);
        obj.add(10,20,30);
        obj.add(10.5,20.5);
    }
}