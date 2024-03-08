package assignment;

import java.time.LocalDate;

//Write a Java Program to Print Current Date and return it as a String.

public class ProblemFourteen {

    public static String displayCurrentDateToString() {
        return LocalDate.now().toString();
    }

    public static void main(String[] args) {
        System.out.println(displayCurrentDateToString());
    }
}
