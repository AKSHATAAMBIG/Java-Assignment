package assignment;

/*
Write a program to print – (Use appropriate String methods)

Only First name from “Sachin Tendulkar”
Only Second name from “Rahul Dravid”
 */
public class ProblemEighteen {
    public static String displayFirstName(String s1) {
        return s1.split(" ")[0];
    }

    public String displaySecondName(String s2) {
        return s2.split(" ")[1];
    }

    public static void main(String[] args) {

        ProblemEighteen p1 = new ProblemEighteen();
        System.out.println(displayFirstName("Sachin Tendulkar"));
        System.out.println(p1.displaySecondName("Rahul Dravid"));
    }
}
