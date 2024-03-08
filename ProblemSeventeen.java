package assignment;

//Write a program to print even or odd number using if condition

public class ProblemSeventeen {

    public static void displayEvenNumber(int n) {
        System.out.println("Even number:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void displayOddNumber(int n) {
        System.out.println("Odd number:");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ProblemSeventeen p17 = new ProblemSeventeen();
        displayEvenNumber(20);
        p17.displayOddNumber(20);
    }
}
