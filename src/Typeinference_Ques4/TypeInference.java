package Typeinference_Ques4;

//var: Introduced in Java 10, var allows the compiler to infer the type of the variable based on the assigned value.
//     It can only be used for local variables.

public class TypeInference {
    public static void main(String[] args) {
        var number = 10; // Inferred as int
        var text = "Hello"; // Inferred as String
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}
