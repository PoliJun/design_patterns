package adapter_pattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("Mp4", "XiDaDa");
        audioPlayer.play("Vlc", "PengMaMa");
        audioPlayer.play("Mp3", "QingFengHua");
    }

}
