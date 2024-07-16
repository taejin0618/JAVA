package static2;

public class DecoMain2 {

    public static void main(String[] args) {

        String s = "hello java";
        String deco = DecoUtil2.deco(s); // static 메서드에 클래스명으로 바로 접근

        System.out.println(s);
        System.out.println(deco);

    }
}