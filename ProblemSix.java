package assignment;

import java.util.*;

/*
Write a program where create an int type arraylist object.
Then add 200 to 500 numbers into the ArrayList then Print the ArrayList.

1.Perform the same for HashSet and print
2.Perform the same for TreeSet and print
 */

public class ProblemSix {

    public static ArrayList<Integer> displayArrayList() {
        ArrayList<Integer> a1 = new ArrayList<>();
        int n = 200;
        for (int i = 0; i <= 500; i++) {
            a1.add(n + i);
        }
        return a1;
    }


    public static HashSet<Integer> displayHashSet() {
        HashSet<Integer> h1 = new HashSet<>();
        int n = 200;
        for (int i = 0; i <= 500; i++) {
            h1.add(n + i);
        }
        return h1;
    }

    public static TreeSet<Integer> displayTreeSet() {
        TreeSet<Integer> t1 = new TreeSet<>();
        int n = 200;
        for (int i = 0; i <= 500; i++) {
            t1.add(n + i);
        }
        return t1;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList value:\n" + displayArrayList() + "\n");
        System.out.println("Hashset value:\n" + displayHashSet() + "\n");
        System.out.println("Treeset value:\n" + displayTreeSet() + "\n");

    }
}
