//Write a JAVA program to implement constructor overloading.
// 3
import java.io.*;

class A {
    A(int a) {
        System.out.println("The area of square is: " + a * a);
    }

    A(int a, int b) {
        super();
        System.out.println("The area of rectangle is: " + a * b);
    }

    A(int a, int b, int c) {
        super();
        System.out.println("The volume of cuboid is: " + a * b * c);
    }
}

class B {
    public static void main(String[] args) throws IOException {
        A obj1 = new A(10);
        A obj2 = new A(10, 2);
        A obj3 = new A(10, 2, 50);
    }
}