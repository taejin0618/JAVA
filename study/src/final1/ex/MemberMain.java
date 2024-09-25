package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myI", "kim");
        member.print();

        Member member1 = new Member("test", "123");
        member1.print();
        member.changeData("myId2", "seo");
        member.print();


    }
}
