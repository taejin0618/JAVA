package access.ex;

/**
 * ShoppingCartMain 클래스는 애플리케이션의 진입점입니다.
 * ShoppingCart를 생성하고 그 안에 아이템을 추가합니다.
 */
public class ShoppingCartMain {
    public static void main(String[] args) {
        // 새로운 ShoppingCart 객체를 생성합니다.
        ShoppingCart cart = new ShoppingCart();

        // 두 개의 새로운 Item 객체를 생성합니다.
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        // 아이템들을 카트에 추가합니다.
        cart.addItem(item1);
        cart.addItem(item2);




        // 카트에 있는 아이템들을 출력합니다.
        cart.displayItems();
    }
}