package assignment;

/*
Run a for loop from 500 to 1000 where
if loop finds number 808 then it will print the number found as 808
 */

public class ProblemFive {

    public static void checkNumberExist() {
        for (int i = 500; i <= 1000; i++) {
            if (i == 808) {
                System.out.println("Number found as:" + i);
            }

        }
    }

    public static void main(String[] args) {
        checkNumberExist();
    }
}
