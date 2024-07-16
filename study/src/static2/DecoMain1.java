package static2;

public class DecoMain1 {

    public static void main(String[] args) {

        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1(); // static 메서드가 아니라 인스턴스 생성 해서 접근
        String deco = utils.deco(s);

        System.out.println(s);
        System.out.println(deco);
    }
}