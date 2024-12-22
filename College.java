//Write a program to implement single inheritance in JAVA.
// 6

class Student {
    void Fee() {
        System.out.println("Student Fee = 20000");
    }
}

class Student_Name extends Student {
    void Name() {
        System.out.println("Student Name = Manoj");
    }
}

class College {
    public static void main(String[] args) {
        Student_Name s = new Student_Name();
        s.Name();
        s.Fee();
    }
}