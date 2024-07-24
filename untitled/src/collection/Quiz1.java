package collection;

import java.util.ArrayList;

public class Quiz1 {
    public static void main(String[] args) {
        ArrayList<Character> c= new ArrayList<>();
        c.add('A');
        c.add('B');
        c.add('C');

        c.remove(1);

        for(char ch:c){
            System.out.println(ch);
        }
    }
}
