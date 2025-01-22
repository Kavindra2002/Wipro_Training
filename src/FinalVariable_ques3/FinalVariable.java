package FinalVariable_ques3;

//Final Variables: Variables declared with the final keyword cannot be modified after initialization.
//They are constants.

public class FinalVariable {
    public static void main(String[] args) {
        final int finalVar = 10;
        // finalVar = 20; // This will cause a compilation error
        System.out.println("Final Variable: " + finalVar);
    }
}
