package assignment;

/*
Write a function which accepts 3 parameters. 2 integers and 1 String.
If String parameter is 'add' then it would add two integers.
Similarly 'subs'/'multiplication'/'division'.
 */
public class ProblemFour {

    public int stringOperation(int num1, int num2, String operation) {
        int result = 0;
        switch (operation) {
            case "add":
                return num1 + num2;
            case "sub":
                return num1 - num2;
            case "mul":
                return num1 * num2;
            case "div":
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        ProblemFour p4 = new ProblemFour();
        System.out.println(p4.stringOperation(10, 20, "mul"));
    }
}
