package operator_pass;

public class Logical1 {

    public static void main(String[] args) {
        System.out.println("&&: AND 연산"); // 둘 다 참이어야 참
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false); // false

        System.out.println("||: OR 연산");    // 둘 중 하나만 참이면 참
        System.out.println(true || true); // true
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산"); // NOT 연산
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

    }
}
