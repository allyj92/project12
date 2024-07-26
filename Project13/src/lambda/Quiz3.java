package lambda;

public class Quiz3 {
    public static void main(String[] args) {

        // 구현 클래스
        StringConverter stringConverter1 = new StringConverterImpl();
        System.out.println(stringConverter1.convert("My Name"));

        // 익명 클래스
        StringConverter stringConverter2 = new StringConverter(){
            public String convert(String s) {
                return s.toUpperCase();
            }
        };
        System.out.println(stringConverter2.convert("She's Name"));

        // 람다식 함수
        StringConverter stringConverter3 = (s) -> s.toUpperCase();
        System.out.println(stringConverter3.convert("He's Name"));


    }
}

// 함수형 인터페이스 선언
interface StringConverter{
    String convert(String s);
}

class StringConverterImpl implements StringConverter{

    @Override
    public String convert(String s) {
        return s.toUpperCase();
    }
}