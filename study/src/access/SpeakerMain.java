package access;

public class SpeakerMain {
    public static void main(String[] args) {


        Speaker speaker = new Speaker(90);
        speaker.show();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.show();

        System.out.println("접근");
//        speaker.voluem = 200;
        speaker.show();
    }
}
