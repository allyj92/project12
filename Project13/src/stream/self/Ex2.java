package stream.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();

        // stream은 1회용 stream에 대해 최종연산을 수행하면 stream이 닫힌다
        intStream = list.stream(); // list로부터 stream을 생성
        intStream.forEach(System.out::println);

        String[] strArr = new String[]{"a","b","c","d","e"};
        Stream<String> strStream = Stream.of(strArr);
        strStream.forEach(System.out::println);

        int[] intArr1 = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr1);
//      intStream1.forEach(System.out::println);
//        System.out.println("count="+intStream1.count()); // 최종 연산
//        System.out.println("average = " + intStream1.average());

    }
}
