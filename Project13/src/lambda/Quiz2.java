package lambda;

public class Quiz2 {
    public static void main(String[] args) {
        // Hello의 구현 클래스를 만들고 , helloPrint()를 호출하세요
        Hello hello = new HelloImpl();
        hello.helloPrint();

        // Hello의 익명 클래스로 구현하고 , helloPrint()를 호출하세요
        Hello hello1 = new Hello(){
            public void helloPrint(){
                System.out.println("익명 클래스, Hello");
            };
        };
        hello1.helloPrint();

       // Hello의 람다식 함수로 구현하고 , helloPrint()를 호출하세요
        Hello hello3 = ()->{ System.out.println("람다식 함수, Hello");};
        hello3.helloPrint();
    }

}

// 함수형 인터페이스 선언
interface Hello {
    void helloPrint();
}


class HelloImpl implements Hello{
    public void helloPrint(){
        System.out.println("구현 클래스,Hello");
    };
}

