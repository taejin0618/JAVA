package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        // num = 2, count = 1 로 초기화, 카운트가 10 보다 작거나 같을때까지 반복, num 2 출력
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            // num 최초 2 출력 후 num 에 + 2 를 count 가 10이 될때까지 반복 count 가 10 이니 10번 반복
            // 2에 2 를 10번 더함 2 의 배수 20까지 출력 2 + 2 + 2 + 2...를 10번 반복
            System.out.println(num); 
        }
    }
}
