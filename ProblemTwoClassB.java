package assignment;


/*From Class_A, call/print an integer variable which is present is Class B.
Where use constructor to reset the value of the variable from Class_A to Class B.

 */
public class ProblemTwoClassB {
    int a = 10;

    ProblemTwoClassB(int value){
        this.a = value;
    }

    public int getValue(){
        return a;
    }
}
