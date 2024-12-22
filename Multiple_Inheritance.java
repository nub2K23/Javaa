//Write a program to implement multiple inheritance using interfaces.
// 8

interface Parent1 {
    void mother();
}

interface Parent2 {
    void father();
}

class Family implements Parent1, Parent2 {
    public void mother() {
        System.out.println("Mother's feature");
    }

    public void father() {
        System.out.println("Fathers's feature");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Family f = new Family();
        f.mother();
        f.father();
    }    
}
