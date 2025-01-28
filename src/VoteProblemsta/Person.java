package VoteProblemsta;

public class Person {
    // Private variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation to ensure age is positive
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be a positive number.");
        }
    }

    // Method to check voting eligibility
    public boolean canVote() {
        return age >= 18;
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        Person person = new Person("John Doe", 20);

        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        if (person.canVote()) {
            System.out.println(person.getName() + " is eligible to vote.");
        } else {
            System.out.println(person.getName() + " is not eligible to vote.");
        }

        // Updating age
        person.setAge(17);
        System.out.println(person.getName() + " is now " + person.getAge() + " years old.");
        if (person.canVote()) {
            System.out.println(person.getName() + " is eligible to vote.");
        } else {
            System.out.println(person.getName() + " is not eligible to vote.");
        }
    }
}
