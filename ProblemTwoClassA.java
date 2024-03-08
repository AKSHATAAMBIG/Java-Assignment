package assignment;

/*From Class_A, call/print an integer variable which is present is Class B.
Where use constructor to reset the value of the variable from Class_A to Class B.

 */
public class ProblemTwoClassA{

    public void printBClassValue() {
        ProblemTwoClassB p = new ProblemTwoClassB(10);
        System.out.println(p.getValue());
        p = new ProblemTwoClassB(100);
        System.out.println(p.getValue());
    }

    public static void main(String[] args) {
        ProblemTwoClassA p2 = new ProblemTwoClassA();
        p2.printBClassValue();
    }
}
