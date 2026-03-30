class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Anu";
    }

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class test1 {
    public static void main(String[] args) {

        // object using default constructor
        Student s1 = new Student();

        // object using parameterized constructor
        Student s2 = new Student(101, "Anamika");

        s1.display();
        s2.display();
    }
}
