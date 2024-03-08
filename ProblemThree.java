package assignment;

/*Write a java program which will throw an exceptipn error for an
AGE field if we pass age below 25 and above 55.

 */
public class ProblemThree {
    public void validateAge(int age) {
        if (age < 25 || age > 55) {
            throw new ArithmeticException("age should not below 25 and above 55");
        } else {
            System.out.println("age is valid");
        }
    }

    public static void main(String[] args) {
        ProblemThree p3 = new ProblemThree();
        p3.validateAge(26);
    }
}
