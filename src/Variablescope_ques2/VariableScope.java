package Variablescope_ques2;

//Class Scope: Variables declared at the class level (instance and static variables) are accessible throughout the class.
//Method Scope: Variables declared inside a method (local variables) are accessible only within that method.
//Block Scope: Variables declared inside a block (e.g., inside loops or if statements) are accessible only within that block

public class VariableScope {
    int classVar = 10; // Class scope

    void method() {
        int methodVar = 20; // Method scope
        if (true) {
            int blockVar = 30; // Block scope
            System.out.println("Block Variable: " + blockVar);
        }
        System.out.println("Method Variable: " + methodVar);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        System.out.println("Class Variable: " + obj.classVar);
        obj.method();
    }
}
