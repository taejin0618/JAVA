package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //변수 sum 을 0 으로 초기화
        int sum = 0;

        while (true) {
            // number 에 정수 0을 입력하면 프로그램 종료
            System.out.print("정수를 입력하세요 (0을 입력하면 종료):");
            int number = input.nextInt();

            // number 변수에 입력한 숫자사 0인지 확인, 0과 같으면 프로그램 종료
            if (number == 0) {
                break;
            }

            // 입력한 숫자가 0이 아니면 sum 변수에 number 입력값을 더한 후 while 문 처음으로 다시 돌아감
            sum += number;
        }
        System.out.println("입력한 모든 정수의 합: " + sum); // sum 에 더한 숫자 출력
    }
}
