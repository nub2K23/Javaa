// Write a program to demonstrate method overloading in Java.
// 5

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of 5 and 3 is " + calculator.add(5, 3));
        System.out.println("Sum of 5, 3 and 2 is " + calculator.add(5, 3, 2));
        System.out.println("Sum of 5.5 and 3.5 is " + calculator.add(5.5, 3.5));
        System.out.println("Concatenation of 'Hello' and 'World' is " + calculator.add("Hello", "World"));
    }
}