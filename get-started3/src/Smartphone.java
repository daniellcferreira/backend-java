public class Smartphone implements VideoPlayer, MusicPlayer {

  @Override
  public void playMusic() {
    System.out.println("Playing music in smartphone");
  }

  @Override
  public void pauseMusic() {
    System.out.println("Pausing music in smartphone");
  }

  @Override
  public void stopMusic() {
    System.out.println("Stopping music in smartphone");
  }

  @Override
  public void playVideo() {
    System.out.println("Playing video in smartphone");
  }

  @Override
  public void pauseVideo() {
    System.out.println("Pausing video in smartphone");
  }

  @Override
  public void stopVideo() {
    System.out.println("Stopping video in smartphone");
  }

}
