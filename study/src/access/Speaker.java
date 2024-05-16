package access;

public class Speaker {
    private int voluem;

    public Speaker(int voluem) {
        this.voluem = voluem;
    }

    void volumeUp() {
        if (voluem >= 100) {
            System.out.println("음략을 증가할 수 없음. 최대 음량");

        } else {
            voluem += 10;
            System.out.println("음략 10 증가");

        }
    }

    void voluemDown() {
        voluem -= 10;
        System.out.println("볼륨 10 줄임");

    }
    void show() {
        System.out.println("현재 음량" + voluem);
    }


}
