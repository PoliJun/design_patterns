package adapter_pattern;

/**
 * AudioPlayer
 */
public class AudioPlayer implements MideaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("Mp3")) {
            System.out.println("Playing Mp3, Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("Mp4") || audioType.equalsIgnoreCase("Vlc")) {
            MediaAdapter adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        }else{
            System.out.println("Not Valid Audio Type");
        }
    }
}