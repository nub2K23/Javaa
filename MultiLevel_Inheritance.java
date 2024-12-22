// Write a program to demonstrate multi-level inheritance in Java.
// 7

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void display() {
        System.out.println("Labrador is a type of Dog");
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Labrador l = new Labrador();
        l.eat();
        l.bark();
        l.display();
    }
}