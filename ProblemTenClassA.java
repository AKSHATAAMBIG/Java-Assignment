package assignment;

/*
How can we access private data from one class to other class?
Explain and write down the code for it?
 */

public class ProblemTenClassA {
    private String name = "Mery";

    private int value = 10;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
