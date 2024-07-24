package map;

import java.text.Collator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz3 {
    public static void main(String[] args) {
        HashMap<String, Float> map = new HashMap<>();
        map.put("국어", 80.0f);
        map.put("수학", 90.0f);
        map.put("영어", 100.0f);


        Set<String> keySet = map.keySet();
        for(String k : keySet){
            System.out.println("과목명 : " + k);
        }

        Collection<Float> values =  map.values();
        for(Float v : values){
            System.out.println("점수 : " + v);
        }

        System.out.println(map.values());


    }


}
