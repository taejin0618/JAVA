package access.b;

import access.a.AccessData;

public class AccessOouterMain {
    public static void main(String[] args) {

        AccessData data = new AccessData(); //객체 생성
        //public 호출
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지
//        data.defaultField = 2;
//        data.defaultField();

        //private 호출 불가
//        data.privateField = 3;
//        data.privateField;

        data.innerAccess(); // innerAccess 메서드 호출
    }

}
