package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; // 클래스 변수 호출
        staticMethod();

        DecoData data5 = new DecoData();
        data5.instanceValue();
//        intanceValue();
    }

    public static void staticCall(DecoData data) {
        data.instaceCall();
        data.instanceValue();
    }

    public void instaceCall() {
        instanceValue++;
        staticMethod();

    }
    private void instanceValue() {
        System.out.println("instanceValue: " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }
}
