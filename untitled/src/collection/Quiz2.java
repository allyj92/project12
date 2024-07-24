package collection;

import java.util.ArrayList;

public class Quiz2 {
    public static void main(String[] args) {
        ArrayList<Character> ch = new ArrayList<>();
        ch.add('A');
        ch.add('B');
        ch.add('C');

        if (ch.contains('A')){
            ch.remove(Character.valueOf('A'));
        }

        for(char c:ch){
            System.out.println(c);
        }

    }
}
