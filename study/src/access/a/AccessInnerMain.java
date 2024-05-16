package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지
        data.defaultField = 2;
        data.defaultField();

        //private 호출 불가
//        data.privateField = 3;
//        data.privateField;

        data.innerAccess();
    }
}
