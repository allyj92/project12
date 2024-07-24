package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz5 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);

        Iterator<Integer> ir = hs.iterator();

        while (ir.hasNext()){ // 다음 요소가 있으면
            Integer member = ir.next(); // 다음 요소를 가져옴
            System.out.println(member + " ");
        }

        System.out.println();

       for(int s:hs){
           System.out.println(s);
       }
    }
}
