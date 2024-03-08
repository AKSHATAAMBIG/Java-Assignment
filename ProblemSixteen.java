package assignment;

import java.time.LocalDate;

/*Write a program to select the current month out of 12 month in the year 2024
using switch statements
 */

public class ProblemSixteen {
    public void getMonth() {
        int monthOfYear = LocalDate.now().getMonthValue();
        switch (monthOfYear) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June 2024");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("month not found");
                break;
        }
    }

    public static void main(String[] args) {
        ProblemSixteen p16 = new ProblemSixteen();
        p16.getMonth();
    }
}
