package assignment;

/*
How can we access private data from one class to other class?
Explain and write down the code for it?
 */

/* Explanation
created the 2 classes ProblemTenClassA and ProblemTenClassB
Declaring private variable and
written getter method in ProblemTenClassA and
can access the private data from classA to classB
 */
public class ProblemTenClassB {

    public static void main(String[] args) {
        ProblemTenClassA p10 = new ProblemTenClassA();
        System.out.println("private value from other class:"+p10.getName());
        System.out.println("private value from other class:"+p10.getValue());

    }
}
