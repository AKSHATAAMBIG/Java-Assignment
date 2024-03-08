package assignment;

/*
Write a program to print 100 numbers using,
1.While loop and
2.For loop
 */
public class ProblemTwelve {
    public void displayNumberUsingForLoop() {
        System.out.println("For loop:");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void displayNumberUsingWhileLoop() {
        System.out.println("While loop:");
        int n = 0;
        while (n < 100) {
            n++;
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        ProblemTwelve t1 = new ProblemTwelve();
        t1.displayNumberUsingForLoop();
        displayNumberUsingWhileLoop();
    }
}
