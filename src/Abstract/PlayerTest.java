package Abstract;

abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}
class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "위치부터 play합니다.");
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}
class CDPlayer extends Player {
    void play(int pos) {
        System.out.println(pos+"트랙에서 play합니다");
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}
class VideoPlayer extends Player {
    void play(int pos) {
        System.out.println(pos+"번째 비디오를 play합니다");
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
        // Player p = new Player;
        AudioPlayer ap = new AudioPlayer();
        CDPlayer cp = new CDPlayer();
        VideoPlayer vp = new VideoPlayer();

        ap.play(100);
        ap.stop();
        cp.play(100);
        cp.stop();
        vp.play(100);
        vp.stop();
    }
}
