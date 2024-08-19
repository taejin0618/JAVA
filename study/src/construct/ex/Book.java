package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    public Book() {
        this("0", "0", 0);
    }

    Book(String title, String author) { // 생성자 오버로딩
        this(title, author, 0);
    }

    Book(String title, String author, int page) { // 생성자 오버로딩
        this.title = title;
        this.author = author;
        this.page = page;
    }

        void displayInfo(){
            System.out.println("제목: " + title + ", " + "저자: " + author + ", " + "페이지: " + page);


        }
    }
