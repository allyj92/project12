package stringbuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        list.add("첫 번째 , ");
        list.add("두 번째, ");
        for( String  l: list){
//            StringBuilder.append(l.getChars());
        }

    }
}
