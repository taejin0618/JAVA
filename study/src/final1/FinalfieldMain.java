package final1;

public class FinalfieldMain {

    public static void main(String[] args) {

        System.out.println("생성자 초기화");
        ConstrucInit construcInit1 = new ConstrucInit(10);
        ConstrucInit construcInit2 = new ConstrucInit(20);

        System.out.println("construcInit1 = " + construcInit1.value);
        System.out.println("construcInit2 = " + construcInit2.value);

        FiedlInit fiedlInit1 = new FiedlInit();
        FiedlInit fiedlInit2 = new FiedlInit();
        System.out.println(fiedlInit1.value);
        System.out.println("static final " + fiedlInit2.CONST_VALUE);

    }
}
