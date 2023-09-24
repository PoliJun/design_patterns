package adapter_pattern;

/**
 * Mp4Player
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4, Name: " + fileName);
    }
    @Override
    public void playVlc(String fileName) {
        // Do nothing
    }
}