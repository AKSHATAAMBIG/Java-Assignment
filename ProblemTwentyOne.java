package assignment;

/*
Write a program to replace the - (Use appropriate String methods)

Original name from “Liverpool” to “Liverpool Football Club”
Original name from “City” to “Manchester City”
 */
public class ProblemTwentyOne {
    String s1 = "Liverpool";
    String s2 = "City";

    public void stringReplacement() {
        System.out.println(s1.replace(s1, "Liverpool Football Club"));
        System.out.println(s2.replace(s2, "Manchester City"));
    }

    public static void main(String[] args) {
        ProblemTwentyOne r1 = new ProblemTwentyOne();
        r1.stringReplacement();
    }
}
