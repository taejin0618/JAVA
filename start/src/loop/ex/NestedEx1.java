package loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {

        // 이중 반복문
        /*
        int 를 1초기화
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
//            System.out.println();
        }
    }
}
