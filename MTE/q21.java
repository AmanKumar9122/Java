class Parent {
    private String name;
    private int age;

    public Parent() {
        this("Default Name", 0);
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Child extends Parent {
    private String occupation;

    public Child(String name, int age, String occupation) {
        super(name, age); // Accessing parent class constructor
        this.occupation = occupation;
    }

    public void printDetails() {
        super.printDetails(); // Calling parent class method
        System.out.println("Occupation: " + occupation);
    }
}

public class q21 {
    public static void main(String[] args) {
        Parent parent = new Parent("John Doe", 35);
        parent.printDetails();

        Child child = new Child("Jane Doe", 28, "Software Engineer");
        child.printDetails();
    }
}

//This code demonstrates constructor overloading and method overloading:
//Constructor overloading: The Parent class has two constructors: a default constructor and a parameterized constructor. This allows you to create Parent objects with or without providing initial values for the name and age fields.
//Method overloading: The Parent and Child classes both have a printDetails() method. However, the methods have different signatures (the number and types of parameters). This allows you to call the printDetails() method with different arguments depending on whether you are working with a Parent or Child object.
//The code also demonstrates accessing a parent class constructor in a child class:
//Accessing parent class constructor: The Child class constructor calls the super(name, age) constructor to initialize the name and age fields from the parent class. This ensures that Child objects have values for these fields, even though the Child constructor does not explicitly assign values to them.