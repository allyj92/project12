package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        // 리스트 생성
        List<Integer> list = Arrays.asList(1,1,2,3,5,4);


        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n-> System.out.println(n+" "));

        // 기본형 스트림 : sum,max 같은 함수 사용 불가
        Stream<Integer> stream2 = list.stream();

        // 숫자타입 스트림 : sum, max, min 같은 함수 사용 가능
        IntStream intStream = stream2
                                 .mapToInt(n -> n.intValue());

        // map : 다른 값으로 변경하는 연산자
        List<String> strList = Arrays.asList("aaa", "bbb", "ccc");

        // 문자열 -> 대문자
        strList.stream()
                .map(s->s.toUpperCase())
                .forEach(s -> System.out.println(s+ " "));

        strList.stream()
                .map(s->s.length())
                .forEach(s -> System.out.println(s+ " "));

                // 도서 리스트
                List<Book> list2 = new ArrayList<>();
                list2.add(new Book("자바프로그래밍", 1000));
                list2.add(new Book("스프링프로젝트", 20000));

                // 도서의 제목만 꺼내서 출력하기
                list2.stream()
                        .forEach(s -> System.out.println(s.price + " "));



    }
}

// 도서 클래스
class Book{
    String title; // 제목
    int price; // 가격

    // 생성자
    public Book(String title, int price) {
        this.title = title; // 제목
        this.price = price; // 가격
    }
}

//R apply(T t){
//    return t.title
//};