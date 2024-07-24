package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {
    public static void main(String[] args) {

        // HashSet 선언 및 생성
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("둘리"); // 회원 추가
        hashSet.add("또치");
        hashSet.add("도우너");
        hashSet.add("도우너");
        System.out.println("set 목록: " + hashSet + " 크기: " + hashSet.size());

        hashSet.remove("도우너"); // 순서가 업슨 set은 인덱스 사용 불가
        System.out.println("set 목록: " + hashSet + " 크기: " + hashSet.size());

        Iterator<String> ir = hashSet.iterator();

        while (ir.hasNext()){ // 다음 요소가 있으면
            String member = ir.next(); // 다음 요소를 가져옴
            System.out.println(member + " ");
        }

        // 람다식 포문
        for(String member : hashSet){
            System.out.println(member + " ");
        }


    }
}
