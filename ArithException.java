// WAP "Divide by zero" that takes two numbers as a and b input, computes a/b and invokes ArithmeticException
// to generate a message when the denominator is zero.

//14

import java.util.Scanner;

public class ArithException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int c;
        sc.close();
        try {
            c = a / b;
            System.out.println("Value of " + a + " / " + b + " = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
