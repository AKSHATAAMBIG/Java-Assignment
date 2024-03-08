package assignment;

/*Write a program to verify if the name of Cristiano Ronaldo is equal to Ronaldo Nazario
(Use appropriate String methods)
 */

public class ProblemTwenty {
    String s1 = "Cristiano Ronaldo";
    String s2 = "Ronaldo Nazario";

    public boolean checkStringEquals() {
        boolean flag = false;
        if (s1.equals(s2)) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        ProblemTwenty c1 = new ProblemTwenty();
        System.out.println(c1.checkStringEquals());
    }
}
