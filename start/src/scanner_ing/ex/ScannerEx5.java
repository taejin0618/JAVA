package scanner_ing.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        // num1이 num2보다 큰 경우, 두 숫자를 교환합니다.
        if (num1 > num2) { // n1 이 n2 보다 크면 실행
            int temp = num1; // 임시 변수에 n1 저장
            num1 = num2; // n1 에 n2 저장
            num2 = temp; // n2 에 임시값 복사
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = num1; i <= num2; i++) { // i 에 n1 값 복사, i 가 n2 보다 작거나 같을때까지
            // n1 이 5 이고 n2 가 7이면 5 ~ 7 까지 반복 5, 6, 7 이니 3버 반복
            System.out.print(i); // i 는 n1 이니 5 출력

            // i 가 n2 와 같지 않으면 , 출력
            if (i != num2) {
                System.out.print(",");
            }

        }
    }

}
