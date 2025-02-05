public class MusicBox implements MusicPlayer {
  @Override
  public void playMusic() {
    System.out.println("Playing music in MusicBox");
  }

  @Override
  public void pauseMusic() {
    System.out.println("Pausing music in MusicBox");
  }

  @Override
  public void stopMusic() {
    System.out.println("Stopping music in MusicBox");
  }
}
