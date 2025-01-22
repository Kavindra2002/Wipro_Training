package Stataicfinal_ques7;

//static final: Used to define constants that cannot be changed and are shared across all instances.

public class Constants {
    static final double PI = 3.14159;

    public static void main(String[] args) {
        double radius = 5.0;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
