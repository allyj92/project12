package lambda.selfpractice;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(9);
        numbers.forEach((n) -> System.out.println(n));
    }
}
