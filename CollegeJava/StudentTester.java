 class Student {

    // Attributes
    private String name;
    private int age;
    private double grade;

    // Constructor 1 (empty constructor)
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = 0.0;
    }

    // Constructor 2 (constructor with all attributes)
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Constructor 3 (name + age only)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0;
    }

    // Method: displayInfo()
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // Method: isAdult()
    public boolean isAdult() {
        return age >= 18;
    }

    // Method: updateGrade(double grade)
    public void updateGrade(double grade) {
        this.grade = grade;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}
public class StudentTester {
    public static void main(String[] args) {

        // Using Constructor 1 (empty)
        Student s1 = new Student();
        s1.displayInfo();
        System.out.println("Is Adult? " + s1.isAdult());
        s1.updateGrade(3.5);
        System.out.println("Updated: " + s1);

        System.out.println("---------------------");

        // Using Constructor 2 (all attributes)
        Student s2 = new Student("Anamika", 18, 3.75);
        s2.displayInfo();
        System.out.println("Is Adult? " + s2.isAdult());
        s2.updateGrade(3.70);
        System.out.println("Updated: " + s2);

        System.out.println("---------------------");

        // Using Constructor 3 (name + age)
        Student s3 = new Student("Anu", 16,2.78);
        s3.displayInfo();
        System.out.println("Is Adult? " + s3.isAdult());
        s3.updateGrade(2.90);
        System.out.println("Updated: " + s3);
    }
}

