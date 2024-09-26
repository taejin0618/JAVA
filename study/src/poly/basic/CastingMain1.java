package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {

        Parent poly = new Child();
//        poly.childMethod(); // 부모 클래스에는 자식 클래스의 메서드가 없어서 컴파일 에러

        // 다운캐스팅
        Child child = (Child)poly;
        child.childMethod();

    }
}
