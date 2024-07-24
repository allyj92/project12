package collection;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // 리스트 요소 하니씩 출력
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
//        System.out.println(list.get(3));

        System.out.println("리스트 전체 요소: " + list);
        list.remove(2);
        System.out.println("리스트 요소 삭제 후: " + list);

        int size = list.size();
        System.out.println("리스트의 크기: " + size);
    }
}
