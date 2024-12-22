//Write a JAVA Program that implements Runtime Polymorphism.
// 11

import java.io.*;

class Override {
    public void methodoverride() {
        System.out.println("This is the base class method");
    }
}

class overridederived extends Override {
    public void methodoverride() {
        System.out.println("This is the derived class method");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Override obj = new Override();
        Override obj1 = new overridederived();
        obj.methodoverride();
        obj1.methodoverride();
    }
}
