public class generalTV implements TV_interface{
  private boolean power;
  private int volume;
  private int channel;

  public generalTV() 
  {
    this.power = false;
    this.volume = 25;
    this.channel = 1;
  }

  public void isEnabled()
  {
    if(power == true)
    {
      System.out.println("The TV is on");
    }
    else 
    {
      System.out.println("The TV is off");
    }
  }
  public void enable()
  {
    if(power == false)
    {
      power = true;
      System.out.println("The TV is ON now");
    } 
  }
  public void disable()
  {
    if(power == true)
    {
      power = false;
      System.out.println("The TV is OFF now");
    } 
  }
  public void getVolume()
  {
    System.out.println("Current Volume is: "+volume);

  }
  public void setVolume(int volume) 
  {
    if (power == true) 
    {
      this.volume = volume;
      System.out.println("Volume set to: " + volume);
    } else {

      System.out.println("Cannot set volume. TV is turned off.");
    }
  }

  public void getChannel() 
  {
    System.out.println("Current channel: " + channel);
  }

  public void setChannel(int channel) 
  {
    if (power) 
    {
      this.channel = channel;
      System.out.println("Channel set to: " + channel);
    } 
    else 
    {
      System.out.println("Cannot set channel. TV is turned off.");

    }
  }

  
}
