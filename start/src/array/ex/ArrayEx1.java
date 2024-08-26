package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
// 첫 번째 학생의 점수는 90점입니다.
        int student1 = 90;
// 두 번째 학생의 점수는 80점입니다.
        int student2 = 80;
// 세 번째 학생의 점수는 70점입니다.
        int student3 = 70;
// 네 번째 학생의 점수는 60점입니다.
        int student4 = 60;
// 다섯 번째 학생의 점수는 50점입니다.
        int student5 = 50;

        int total = student1 + student2 + student3 + student4 + student5;  // 점수를 모두 더하여 total 변수에 저장
        double average = (double) total / 5; // total 변수를 5로 나누어 평균을 구하여 average 변수에 저장

        System.out.println("점수 총합: " + total); // total 변수 출력
        System.out.println("점수 평균: " + average); // average 변수 출력
    }
}