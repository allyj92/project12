package generic;

class Powder{

    public void doPrinting(){
        System.out.println("Powder 재료를 출력합니다.");
    }

    public String toString(){
        return "재료는 powder 입니다.";
    }
}

// 재료로 사용할 플라스틱 클래스
class Plastic{
    public void doPrinting(){
        System.out.println("Plastic 재료를 출력합니다.");
    }

    public String toString(){
        return "재료는 plastic 입니다";
    }
}

// 파우더를 재료로 사용하는 프린터기 만들기
class ThreeDPrinter1{
    private Powder material;

    public Powder getMaterial() {
        return material;
    }

    public void setMaterial(Powder material) {
        this.material = material;
    }
}

// 플라스틱을 재로로 사용하는 프린터 만들기
class ThreeDPrinter2{
    private Plastic material; // 변수의 자료형을 Plastic으로 변환

    public Plastic getMaterial() {
        return material;
    }

    public void setMaterial(Plastic material) {
        this.material = material;
    }
}