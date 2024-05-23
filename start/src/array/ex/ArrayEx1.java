package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) { // main method
        int student1 = 90; // int 타입의 student1 변수의 90 할당
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        int total = student1 + student2 + student3 + student4 + student5; // int 타입의 total 변수의 값을 복사해서 각 더한다
        double average = (double) total / 5; // double 타입의 average 변수에 total 의 더한 값을 5로 나눈다

        System.out.println("점수 총합: " + total); // total 값 출력
        System.out.println("점수 평균: " + average); // total 에서 5 로 나눈값 출력
    }
}