package stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz1 {
    public static void main(String[] args) {
        String[] arr = {"aaa","bbb","b","b","ccccc"};

        // steam 배열 생성하기
        Stream<String> stream = Stream.of(arr);

        // 1. 문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요 (결과 : 3)

        long count = Arrays.stream(arr).filter (s->s.length()>2).count();
        System.out.println(count);

        // 2. 모든 문자열의 길이를 더한 합을 구하세요 (결과 : 13)
        int arrayLengthSum = Arrays.stream(arr).map(k->k.length()).mapToInt(k->k).sum();
        System.out.println(arrayLengthSum);

        // 3. 가장 길이가 짧은 문자열의 길이를 구하세요 (결과 : 1)
        OptionalInt arrayShortestLength = Arrays.stream(arr).map(l->l.length()).mapToInt(l->l).min();
        System.out.println(arrayShortestLength);

        // 4. 중복을 제거한 리스트를 만드세요. (결과 [aaa, b , ccccc])
        String ArrayDistinctRemove = Arrays.toString(Arrays.stream(arr).distinct().toArray());
        System.out.println(ArrayDistinctRemove);

    }
}
