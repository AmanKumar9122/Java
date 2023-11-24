class Student {
    private String name;
    private int rollNo;
    private int marks;

    // Default constructor
    public Student() {
        this("Default Name", 1, 0);
    }

    // Parameterized constructor
    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to initialize instance variables using reference
    public void initializeByReference(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display student information
    public void show() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class q26 {
    public static void main(String[] args) {
        // Initialize using constructor
        Student student1 = new Student("John Doe", 12345, 90);
        student1.show();

        // Initialize using method
        Student student2 = new Student();
        student2.initializeByReference("Alice", 54321, 75);
        student2.show();

        // Initialize using default constructor and then modify using reference
        Student student3 = new Student();
        student3.show();
    }
}