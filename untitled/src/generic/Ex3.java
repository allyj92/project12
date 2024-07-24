package generic;

public class Ex3 {
    public static void main(String[] args) {
        // 파우더를 사용하는 프린터기 생성
        ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
        printer1.setMaterial(new Powder());
        Powder powder = printer1.getMaterial();
        powder.doPrinting();

        // 플라스틱을 사용하는 프린터기 생성
        ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
        printer2.setMaterial(new Plastic());
        Plastic plastic = printer2.getMaterial();
        plastic.doPrinting();
    }
}

class ThreeDPrinter<T> { // 다이아몬드 연산자안에 문자 T 작성

    private T material; // Object대신 문자 T 작성


    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

}


