package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        // int 타입의 배열 생성 후 students 변수의 값을 바로 초기화를 한번에
        int[] students = {90, 80, 70, 60, 50};

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
