package assignment;

//Write a Program to Reverse The String "Welcome To Java"?

public class ProblemThirteen {
    String str1 = "Welcome To Java";

    public String reverseString() {
        String s1 = new StringBuffer(str1).reverse().toString();
        return s1;

    }

    public static void main(String[] args) {
        ProblemThirteen p1 = new ProblemThirteen();
        System.out.println(p1.reverseString());

    }
}
