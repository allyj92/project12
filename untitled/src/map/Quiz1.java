package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz1 {
    public static void main(String[] args) {
        HashMap<Character,String> map = new HashMap<>();

        map.put('a',"사과");
        map.put('b',"바나나");
        map.put('c',"코코넛");

        System.out.println(map.get('b'));

        System.out.println(map.replace('b',"블루베리"));


        if (map.containsValue("사과")){
            map.remove('a',"사과");
        }

        Set<Character> keyset = map.keySet();

        for(char k : keyset){
            System.out.println(k);
        }

    }
}
