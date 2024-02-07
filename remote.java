public class remote {
  public TV_interface tv;

  public void togglePower()
  {
    if(TV_interface.power)
    {
      tv.enable();
    }
    else
    {
      tv.disable();
    }
  }
  public void volumeUp()
  {
    tv.setVolume(TV_interface.volume +1);
  }
  public void volumeDown()
  {
    tv.setVolume(TV_interface.volume -1);
  }
  public void channelUp()
  {
    tv.setChannel(TV_interface.channel +1);
  }
  public void channelDown()
  {
    tv.setChannel(TV_interface.channel - 1);
  }
}
