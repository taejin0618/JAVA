package extends1.super1;

import extends1.access.parent.Parent;

public class Super1Main extends Parent {

    public static void main(String[] args) {
        Child child = new Child();
        child.call();
        System.out.println(child.value);
    }
}
