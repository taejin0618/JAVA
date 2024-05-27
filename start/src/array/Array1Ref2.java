package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) { // students 배열의 수만큼 반복 여기서 students 배열의 수는 5니까 5만큼 반복
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]); //학생 i + 1 로 학생1 :students[0] 에 있는 90
            // 학생1 의 점수는 90
        }
    }
}
