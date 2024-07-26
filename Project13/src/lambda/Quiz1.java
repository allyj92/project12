package lambda;

public class Quiz1 {
    public static void main(String[] args) {

        // 구현 클래스 사용
        MyNumber number1 = new MyNumberImpl();
        System.out.println("구현 클래스 : " + number1.max(3,4));

        // 익명 클래스를 사용하여 구현
        MyNumber myNumber = new MyNumberImpl(){

            @Override
            public int max(int x, int y) {
                return x>y? x:y;
            }

        };
        System.out.println("익명클래스 : "+ myNumber.max(2,4));

        // 람다식 함수를 사용하여 구현
        MyNumber myNumber1 = (x,y) -> x>y? x:y;
        System.out.println("람다 함수 : " + myNumber1.max(5,7));

    }
}

// 함수형 인터페이스
interface MyNumber{
    int max(int x, int y);
}

// Q. MyNumver의 구현 클래스 만들기!


class MyNumberImpl implements MyNumber{

    @Override
    public int max(int x, int y) {
       return x>y? x:y;
        }
    }

