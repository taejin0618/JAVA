package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수
        final int data1;

        data1 = 10; // final 은 한번만 할당 가능

        final int data2 = 20;

        method(10);
    }

    static void method(final int param) {
//        param = 20;
    }
}
