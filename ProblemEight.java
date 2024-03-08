package assignment;

/*
String a = "Welcome To Java" , count the number of space present
 in the sentence and print only "Welcome" using array.
 */
public class ProblemEight {
    String a = "Welcome To Java";

    public void countingSpaces() {
        System.out.println("space count:" + (a.length() - a.replaceAll
                (" ", "").length()));
    }

    public void printValue() {
        String[] value1 = a.split(" ");
        System.out.println("Display welcome: " + value1[0]);
    }

    public static void main(String[] args) {
        ProblemEight p8 = new ProblemEight();
        p8.countingSpaces();
        p8.printValue();

    }
}
