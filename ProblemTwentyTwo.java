package assignment;

/*
Write a program to print “Narendra Modi” to - (Use appropriate String methods)
UpperCase & the LowerCase
 */
public class ProblemTwentyTwo {
    public static String convertToUppercase(String name) {
        return name.toUpperCase();
    }

    public String convertToLowercase(String name) {
        return "Lower case:" + name.toLowerCase();
    }

    public static void main(String[] args) {

        ProblemTwentyTwo u1 = new ProblemTwentyTwo();
        System.out.println("Upper case:" + convertToUppercase("Narendra Modi"));
        System.out.println(u1.convertToLowercase("Narendra Modi"));
    }
}
