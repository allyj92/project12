package stream.self;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Ex5 {
    public static void main(String[] args) {
        // 스트림 생성
        String[] words = {"Hello","World","Stream"};
        Arrays.stream(words).forEach(System.out::println);

//        문자열 리스트를 스트림으로 변환하여 출력하라.
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        names.stream().forEach(System.out::println);


        // 스트림 필터링

//       문자열 리스트에서 길이가 4 이상인 문자열만 필터링하여 출력하라.
        List<String> l1 = Arrays.asList("Java", "Stream", "Example", "API");
        l1.stream().filter(word -> word.length()>=4).forEach(System.out::println);

        // 문자열 리스트에서 'a'를 포함한 문자열만 필터링하여 추출하여라
        List<String> l2 = Arrays.asList("Java", "Stream", "Example", "API");
        l2.stream().filter(t->t.contains("a")).forEach(System.out::println);

        // 스트링 매핑
        String[] a1 = {"Java", "Stream", "Example"};
        Arrays.stream(a1).map(t->t.toUpperCase()).forEach(System.out::println);

        List<String> l3 = Arrays.asList("Java", "Stream", "Example");
        l3.stream().map(t->t.toUpperCase()).forEach(System.out::println);

        // 문자열 리스트의 각 문자열의 길이를 매핑하여 출력하라.
        List<String> l4 = Arrays.asList("Java", "Stream", "Example");
        String[] a2 = {"Java", "Stream", "Example"};

        l4.stream().map(t->t.length()).forEach(System.out::println);
        Arrays.stream(a2).map(t->t.length()).forEach(System.out::println);

        // 스트림 정렬
        List<String> l5 = Arrays.asList("Java", "Stream", "Example");
        String[] a3 = {"Java", "Stream", "Example"};

        // 문자열 리스트를 알파벳 순으로 정렬하여 출력하라.
        l5.stream().sorted().forEach(System.out::println);
        Arrays.stream(a3).sorted().forEach(System.out::println);

        // 문자열 리스트를 길이 순으로 정렬하여 출력하라.
        l5.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
        Arrays.stream(a3).sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


        // 스트림 리듀싱
        // 문자열 리스트의 모든 문자열을 연결하여 출력하라.
        List<String> l6 = Arrays.asList("Java", "Stream", "Example");
        String[] a4 ={"Java", "Stream", "Example"};
        String result = l6.stream().reduce("",String::concat);
        System.out.println(result);

        // 스트림의 요소 검사
//        문자열 리스트에 Stream이 포함되어 있는지 검사하라.
        List<String> l7 = Arrays.asList("Java", "Stream", "Example");
        String[] a5 = {"Java", "Stream", "Example"};
        boolean containsStream = l7.stream().anyMatch("Stream"::equals);
        System.out.println(containsStream);

        // 문자열 리스트의 모든 문자열이 길이가 4 이상인지 검사하라
        boolean allLongerThanFour = Arrays.stream(a5).allMatch(k->k.length()>=4);
        System.out.println(allLongerThanFour);



    }

}
