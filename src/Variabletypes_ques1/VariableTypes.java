package Variabletypes_ques1;

//Local Variables: Declared inside a method or block. They are created when the method is called and destroyed when the method exits. They must be initialized before use.
//
//Instance Variables: Declared inside a class but outside any method. They are created when an object is instantiated and destroyed when the object is destroyed. Each object has its own copy of instance variables.
//
//Static Variables: Declared with the static keyword inside a class but outside any method. They are created when the class is loaded and destroyed when the class is unloaded. There is only one copy of a static variable, shared by all instances of the class.

public class VariableTypes {
    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    void method() {
        // Local variable
        int localVar = 30;
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
        obj.method();
    }
}
