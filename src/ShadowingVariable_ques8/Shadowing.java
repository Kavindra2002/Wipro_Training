package ShadowingVariable_ques8;

/*Shadowing: When a variable declared in a narrower scope (e.g., method or block) has
          the same name as a variable in a broader scope (e.g., class).

          Class-Level Variable: int var = 10;

Method-Level Variable: int var = 20; (shadows the class-level variable)

Block-Level Variable: int var = 30; (attempts to shadow the method-level variable)

The issue arises in the method() where the block-level variable var is declared inside the if block.
Since var is already declared in the method scope, redeclaring it in the block scope is not allowed.


 */

public class Shadowing {
    int var = 10; // Class-level variable

    void method() {
        int var = 20; // Method-level variable (shadows class-level variable)
        System.out.println("Method Variable: " + var);

        if (true) {
            int blockVar = 30; // Block-level variable (different name)
            System.out.println("Block Variable: " + blockVar);
        }
    }

    public static void main(String[] args) {
        Shadowing obj = new Shadowing();
        System.out.println("Class Variable: " + obj.var);
        obj.method();
    }
}