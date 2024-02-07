public class controlpanel {
  public static void main(String args[])
  {
    TV_interface smarttv = new smartTV();
    smartRemote smartremote = new smartRemote(smarttv);

    smartremote.togglePower();
    smartremote.volumeUp();
    smartremote.volumeDown();
    smartremote.channelDown();
    smartremote.channelUp();
    smartremote.showYoutube();
  }
}
