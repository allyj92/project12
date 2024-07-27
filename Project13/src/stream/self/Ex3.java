package stream.self;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(5,10); // 무한 스트림
        intStream
                .limit(10) // 10개만 자르기
                .forEach(System.out::println);


    }
}
