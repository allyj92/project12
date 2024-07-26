package innerclass;

class A{
    int num = 10;
}

class B {
    void method(){
        A a = new A();
        System.out.println(a.num);
        // B클래서에서 A클래스의 멤버를 사용하려면 객체를 생성해야합!
    }
}

class C {
    int num = 10;

    // 내부 클래스
    class D{
        void method(){
            System.out.println(num);
        }
        // 객체 생성없이 클래스 멤버 사용 가능!
    }
}