package final1;

public class ConstanMain1 {

    public static void main(String[] args) {
        System.out.println("최대 사용자" + Constant.MAX_USERS);

        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("사용자" + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자");
        } else {
            System.out.println("참여");
        }

    }
}
