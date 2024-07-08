package operator_pass;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); // a와 b가 같은지 비교
        System.out.println(a != b); // a와 b가 다른지 비교
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담을
        boolean result = a == b; // a와 b가 같은지 비교
        System.out.println(result); // false
    }
}
