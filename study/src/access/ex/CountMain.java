package access.ex;

public class CountMain {

    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3); // MaxCounter 생성자에 3을 넣어줌
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
