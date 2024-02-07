public class controlpanel {
  public static void main(String args[])
  {
    TV_interface smarttv = new smartTV();
    TV_interface generaltv = new generalTV();
    smartRemote smartremote = new smartRemote(smarttv);
    generalremote generalRemote = new generalremote(generaltv);
    smartremote.togglePower();
    smartremote.volumeUp();
    smartremote.volumeDown();
    smartremote.channelDown();
    smartremote.channelUp();
    smartremote.showYoutube();

    generalRemote.togglePower();
    generalRemote.volumeUp();
    generalRemote.volumeDown();
    generalRemote.channelDown();
    generalRemote.channelUp();


  }
}
