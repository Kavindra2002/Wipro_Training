package Dafaultvaluesvariable_ques9;

/*Instance and Static Variables: Have default values (e.g., 0 for int, null for objects, false for boolean).

Local Variables: Must be initialized before use; no default values.

 */

public class DefaultValues {
    int instanceVar;
    static int staticVar;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);

        // int localVar; // Uncommenting this will cause a compilation error
        // System.out.println("Local Variable: " + localVar);
    }
}
