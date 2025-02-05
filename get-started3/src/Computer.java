public class Computer implements MusicPlayer, VideoPlayer {
  @Override
  public void playMusic() {
    System.out.println("Playing music in computer");
  }

  @Override
  public void pauseMusic() {
    System.out.println("Pausing music in computer");
  }

  @Override
  public void stopMusic() {
    System.out.println("Stopping music in computer");
  }

  @Override
  public void playVideo() {
    System.out.println("Playing video in computer");
  }

  @Override
  public void pauseVideo() {
    System.out.println("Pausing video in computer");
  }

  @Override
  public void stopVideo() {
    System.out.println("Stopping video in computer");
  }

}
