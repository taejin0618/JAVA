package scanner_ing.ex;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        // Scanner 함수 선언
        Scanner scanner = new Scanner(System.in); // Scanner 는 입력을 받는 함수

        System.out.print("당신의 이름을 입력하세요:");
        String name = scanner.nextLine(); // scaaner 에 String 입력시 nextLine 사용 하여 입력 받음

        System.out.print("당신의 나이를 입력하세요:");
        int age = scanner.nextInt(); // 입력 받을 내용이 정수 일때 nextInt 사용

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}
