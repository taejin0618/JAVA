package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // while 참일때까지 반복
        while (true) {
            // 문자열 입력
            System.out.print("문자열을 입력하세요(exit: 종료):");
            // str 변수에 문자열 입력
            String str = scanner.nextLine();
            // 만약 입력한 문자가 exit 이면 프로그램을 종료합니다 출력 후 break 문을 만나서 종료

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            // 입력한 문자가 exit 가 아니면 입력한 문자열 출력 후 다시 while 문 처음으로 돌아감
            System.out.println("입력한 문자열: " + str);
        }
    }
}
