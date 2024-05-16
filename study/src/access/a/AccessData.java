package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicField = " + publicField);
    }

    void defaultField() {
        System.out.println("DefaultField = " + defaultField);
    }

    private void privateFidle() {
        System.out.println("privateField = " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultField();
        privateFidle();

    }
}
