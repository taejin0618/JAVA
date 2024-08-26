package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // int 타입의 배열을 선언하고 students 변수를 생성하고 값을 저장

        int total = 0; // total 변수를 0으로 초기화
        for (int i = 0; i < students.length; i++) { // for문을 사용하여 students.length(배열의 길이만큼 반복) = 5번 반복
            total += students[i]; // total 변수에 students 배열의 i번째 값을 더하고 for문을 반복
        }
        double average = (double) total / 5; // total 변수를 5로 나누어 평균을 구하여 average 변수에 저장
        System.out.println("점수 총합: " + total); // total 변수 출력
        System.out.println("점수 평균: " + average); // average 변수 출력
    }
}