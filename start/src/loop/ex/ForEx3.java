package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        int max = 100; // max 변수 100 으로 초기화

        int sum = 0; // sum 변수 0 으로 초기화

        // i 가 max 보다 작거나 같을때까지 반복 max 는 100 이니 100번 반복
        for (int i = 1; i <= max; i++) {
            sum += i; // int 는 최초 1 sum 에 1 대입 후 다시 반복시 sum 에 1을 계속 더하여 100 번 더하기
            // sum = 1 + 1 + 1 + 1
        }
        System.out.println(sum); // 1 부터 100 까지 더한 수를 출력
    }
}
