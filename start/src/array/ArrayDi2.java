package array;

public class ArrayDi2 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; //행2, 열3

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //0행, 2열

        // row 는 0 row 가 2보다 작을때까지 반복
        for (int row = 0; row < 2; row++) {
            // column 은 0 column 이 3보다 작을때까지 반복
            for (int column = 0; column < 3; column++) {
                // row 0, column 0 = 1
                // row 0, columm 1 = 2
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();//한 행이 끝나면 라인을 변경한다.
        }
    }
}
