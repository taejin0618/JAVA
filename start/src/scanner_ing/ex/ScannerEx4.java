package scanner_ing.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요: ");
        int n = input.nextInt(); // 정수 입력

        System.out.println(n + "단의 구구단: ");
        for (int i = 1; i <= 9; i++) { // i 는 1, i 가 9보다 작거나 같을때까지 반복 1 ~ 9
            System.out.println(n + " x " + i + " = " + n * i); // 입력한 정수 n x i = n x i, ex
        }
    }
}
