package access.a;

public class AccessData {


    // 접근 제어자 설명
    public int publicField; // public 접근 제한, 어디서나 접근 가능
    int defaultField;    // default 접근 제한, 같은 패키지 안에서 접근 가능
    private int privateField;   // private 접근 제한, 같은 클래스 내에서만 접근 가능 AccessData 에서만 접근

    //publicMethod 메서드 선언

    public void publicMethod() { // 메서드 선언
        System.out.println("publicField = " + publicField); // publicField 는 publicField 값
    }

    //defaultField 메서드 선언
    public void defaultField() {
        System.out.println("DefaultField = " + defaultField); // DefaultField 값 출력
    }

    // private 메서드 선언
    private void privateField() { // 해당 메서드는 해당 클래스에서만 호출 가능
        System.out.println("privateField = " + privateField);
    }
// innerAccess 메서드 생성
    public void innerAccess() {
        System.out.println("내부호출");
        publicField = 100; // 각 변수 초기화
        defaultField = 200;
        privateField = 300;
        publicMethod(); // 메서드 호출
        defaultField();
        privateField();

    }



}
