/**
 * TV_interface
 */
public interface TV_interface {
  public static boolean power = false;
  public static int volume = 25;
  public static int channel = 1;
  //function declaration is given.
  public void isEnabled();
  public void enable();
  public void disable();
  public void getVolume();
  public void setVolume(int volume);
  public void getChannel();
  public void setChannel(int channel);
}
