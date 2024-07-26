package lambda;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
//     문자열 리스트 생성
        List<String> list = new ArrayList<>() ;

//        문자열 추가
        list.add("add");
        list.add("ccc");
        list.add("bbb");

//        Collections.sort(): 리스트의 요소를 순서대로 정렬하는 메소드
        Collections.sort(list, new Comparator<String>() {
            // 리스트안에 있는 문자열을 비교하는 로직
           //  더작은 알파벳이 앞으로 오는 로직
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2); //
            }
        });

        System.out.println("리스트 순정렬:" + list);

        Collections.sort(list,((o1,o2) ->o1.compareTo(o2)));
            // 리스트안에 있는 문자열을 비교하는 로직
    }
}
