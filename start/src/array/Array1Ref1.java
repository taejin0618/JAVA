package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; // int 타입의 배열 선언 변수 이름은 students
        students = new int[5]; // students 변수에 5개의 인덱스 할당

        String[] stu;
        stu = new String[1];
        stu[0] = "가나다";
        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
        System.out.println("stu = " + stu[0]);
    }
}
