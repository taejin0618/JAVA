package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10]; // 최대 10개의 아이템을 저장할 수 있는 배열
    private int itemCount; // 현재 아이템의 개수를 저장할 변수

    public void addItem(Item item) {
        if (itemCount >= items.length) { // 아이템 개수가 배열의 길이를 초과하면
            System.out.println("장바구니가 가득 찾습니다."); // 경고 메시지 출력
            return; // 메소드 종료
        }
        items[itemCount] = item; // 아이템을 배열에 추가
        itemCount++; // 아이템 개수 증가
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력"); // 메시지 출력
        for (int i = 0; i < itemCount; i++){ // 모든 아이템에 대해
            Item item = items[i]; // 아이템을 가져와서
            System.out.println("상품명:" + item.getName() + ",합계:" + item.getTotalPrice()); // 상품명과 합계 가격 출력
        }
        System.out.println("전체 가격합 :"+ calculateTotalPrice()); // 전체 가격합 출력
    }
    private int calculateTotalPrice(){
        int totalPrice = 0; // 전체 가격을 저장할 변수
        for (int i = 0; i < itemCount; i++) { // 모든 아이템에 대해
            Item item = items[i]; // 아이템을 가져와서
            totalPrice += item.getTotalPrice(); // 아이템의 가격을 전체 가격에 더함
        }
        return totalPrice; // 전체 가격 반환
    }
}