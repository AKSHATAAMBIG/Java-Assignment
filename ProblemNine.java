package assignment;

/*
Print only 12345 from below string
"ABCDE12345"
 */

public class ProblemNine {

    String value = "ABCDE12345";

    public String removeCharacter(){
        return value.replaceAll("[^0-9.]","");
    }
    public static void main(String[] args) {
        ProblemNine p1 = new ProblemNine();
        System.out.println(p1.removeCharacter());

    }
}
