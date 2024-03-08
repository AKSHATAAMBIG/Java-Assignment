package assignment;

/*
Write a program to - (Use appropriate String methods)

Correct the spelling mistake from “Davi Beckham” to “David Beckham”
Correct the number of goals scored by Lionel Messi from 400 to 579
 */
public class ProblemNineteen {

    public static String checkSpelling(String s1) {
        return s1.replace("Davi", "David");
    }

    public int goalsScored(int oldScore, int newScore) {
        return newScore;
    }

    public static void main(String[] args) {
        ProblemNineteen p19 = new ProblemNineteen();
        System.out.println(p19.goalsScored(400, 579));
        System.out.println(checkSpelling("Davi Beckham"));
    }
}
