package Staticnonstatic_ques5;

//Static Variables: Belong to the class, shared among all instances. Accessed using the class name.
//Non-Static Variables: Belong to the instance, each object has its own copy. Accessed using the object reference.

public class StaticVsNonStatic {
    static int staticVar = 10;
    int nonStaticVar = 20;

    public static void main(String[] args) {
        StaticVsNonStatic obj1 = new StaticVsNonStatic();
        StaticVsNonStatic obj2 = new StaticVsNonStatic();

        System.out.println("Static Variable (obj1): " + staticVar);
        System.out.println("Non-Static Variable (obj1): " + obj1.nonStaticVar);

        obj1.nonStaticVar = 30;
        staticVar = 40;

        System.out.println("Static Variable (obj2): " + staticVar);
        System.out.println("Non-Static Variable (obj2): " + obj2.nonStaticVar);
    }
}
