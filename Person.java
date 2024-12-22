//Write a JAVA program to implement constructor overloading (using this()).
// 4

public class Person {
    private String name;
    private int age;
    public Person(String name) {
        this.name = name;
    }    
    
    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 30);
        
        person1.display();
        person2.display();
    }
    
}