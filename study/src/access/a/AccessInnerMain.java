package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData(); //AccessData 객체 생성
        //public 호출 가능
        data.publicField = 1; // data 객체의 publicField 변수에 1 대입
        data.publicMethod(); // publicMethod 메서드 호출

        //같은 패키지 내에서는 default 접근 가능
        data.defaultField = 2;
        data.defaultField();

        //private 호출 불가 (같은 클래스 내에서만 접근 가능)
//        data.privateField = 3;
//        data.privateField;

        data.innerAccess(); // innerAccess 메서드 호출

    }
}
