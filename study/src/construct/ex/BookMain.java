package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("hello","김태진");
        book2.displayInfo();

        Book book3 = new Book("자바", "김태", 100);
        book3.displayInfo();


    }
}
