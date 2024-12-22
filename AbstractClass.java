// Write a JAVA program for abstract class to find the area of different shapes.
// 10

import java.util.*;

abstract class Shape {
    int length, breadth, radius;
    Scanner input = new Scanner(System.in);
    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.print("\n*** Finding the Area of Rectangle ***\n");
        System.out.print("Enter length and breadth: ");
        length = input.nextInt();
        breadth = input.nextInt();
        System.out.println("The area of Rectangle is: " + length * breadth);
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.print("\n*** Finding the Area of Triangle ***\n");
        System.out.print("Enter Base and Height: ");
        length = input.nextInt();
        breadth = input.nextInt();
        System.out.println("The area of Triangle is: " + (length * breadth) / 2);
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.print("\n*** Finding the Area of Circle ***\n");
        System.out.print("Enter Radius: ");
        radius = input.nextInt();
        System.out.println("The area of Circle is: " + 3.14f * radius * radius);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.printArea();
        Triangle tri = new Triangle();
        tri.printArea();
        Circle cir = new Circle();
        cir.printArea();
    }   
}
