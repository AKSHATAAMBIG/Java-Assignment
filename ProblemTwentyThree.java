package assignment;


//Write a program to Catch any exception in java. Use try catch and finally statements

public class ProblemTwentyThree {
    public static void checkingException(int num1,int num2) {
        try {
            int num = num1 / num2;

        } catch (ArithmeticException e) {
            System.out.println("number can't be divisible by zero");

        } finally {
            System.out.println("finally block is executed");
        }
    }
    public static void main(String[] args) {
        checkingException(10,0);
    }
}
