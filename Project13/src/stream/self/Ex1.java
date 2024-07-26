package stream.self;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {

    // 1> 스트림 만들기 -> 2> 중간 연산 -> 3> 최종연산
    // 배열 스트림
    String[] arr = new String[]{"a","b","c"};
    Stream<String> stream1 = Arrays.stream(arr);

    // 컬렉션 스트림
    List<String> list = Arrays.asList("a","b","c");
    Stream<String> stream2 = list.stream();

    // Stream.builder()
    Stream<String> builderStream = Stream.<String>builder()
            .add("a").add("b").add("c")
            .build();

    // 람다식
    Stream<String> generatedStream = Stream.generate(()->"a").limit(3);
    Stream<Integer> iteratedStream = Stream.iterate(0, n->n+2).limit(5);

    // 기본 타입형 스트림
    IntStream intStream = IntStream.range(1,5);

    // 병렬 스트림
    Stream<String> parallelStream = list.parallelStream();
}
