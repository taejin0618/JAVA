package scanner_ing.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 선언

        System.out.print("하나의 정수를 입력하세요:");
        int number = scanner.nextInt(); // number 변수에 정수 입력 받음

        if (number % 2 == 0) { // 만약에 입력 받은 정수를 2 로 나눈 값이 0과 같으면
            System.out.println("입력한 숫자 " + number + "는 짝수입니다."); // 나눈 값이 0과 같으면 짝수 입니다. 출력
        } else {
            System.out.println("입력한 숫자 " + number + "는 홀수입니다."); // 나눈 값이 0이 아니면 홀수 입니다. 출력
        }
    }
}
