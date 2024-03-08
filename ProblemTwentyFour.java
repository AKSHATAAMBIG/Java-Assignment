package assignment;

//Write a program to create 3 overloaded constructors and print all the 3 overloaded constructors.

public class ProblemTwentyFour {
    ProblemTwentyFour(int a, int b) {
        System.out.println("overloaded constrctor1");
    }

    ProblemTwentyFour(int a, int b, int c) {
        System.out.println("overloaded constrctor2");
    }

    ProblemTwentyFour(double a, double b) {
        System.out.println("overloaded constrctor3");
    }

    public static void main(String[] args) {
        ProblemTwentyFour p24 = new ProblemTwentyFour(4.0f, 8.0f);
    }
}
