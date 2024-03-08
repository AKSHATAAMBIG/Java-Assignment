package assignment;

//Write a java program to create a random AlphaNumeric number and Retun it as a String

public class ProblemFifteen {
    String alphaNumeric = "ABC2356YDGSfffffffS";

    public String returnToString() {
        return alphaNumeric.toString();
    }

    public static void main(String[] args) {
        ProblemFifteen a = new ProblemFifteen();
        System.out.println(a.returnToString());
    }
}
