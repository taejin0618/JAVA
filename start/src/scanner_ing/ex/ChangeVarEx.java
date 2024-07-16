package scanner_ing.ex;

// 변수에 할당된 값 바꾸기
public class ChangeVarEx {

    public static void main(String[] args) {
        int a = 10; // 10으로 초기화
        int b = 20; // 20으로 초기화
        int temp; // 임시 값을 넣을 변수 선언

        //시작: 코드를 작성하세요
        temp = a; // 임시변수에 a 메 할당 / temp 는 10
        a = b; // a 변수에 b 복사 / a 는 20으로 변경
        b = temp; // b 변수에 temp 복사 // 여기서 temp 변수는 위에서 a 값을 복사 하였기 때문에 10 으로 초기화
        //종료: 코드를 작성하세요

        System.out.println("a = " + a); // a 는 20
        System.out.println("b = " + b); // b 는 10
    }
}