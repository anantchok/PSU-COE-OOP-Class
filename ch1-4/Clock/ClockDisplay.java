
// ClockDisplay.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the minIncrement method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */


public class ClockDisplay
{
  private NumberDisplay hours;
  private NumberDisplay minutes;
  private NumberDisplay seconds;
  private String currTimeString;  // the current time as a string
    

  public ClockDisplay()
  // intialize the clock to 00:00
  {
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
    seconds = new NumberDisplay(60);
    setTimeString();
  }


  private void setTimeString()
  // store the current time as a string of the form "hours:minutes"
  {  currTimeString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();  }



  public void setTime(int hour, int minute)
  // set the time to the specified hour and minute
  {
    hours.setValue(hour);
    minutes.setValue(minute);
    setTimeString();
  }  // end of setTime()


  public String getTime()
  // return the current time as a string
  { return currTimeString; }
    


  public void minIncrement()
  // increment the clock by one minute;
  // the hour increments when the minutes roll over to zero
  {
    minutes.increment();
    if (minutes.getValue() == 0) // minutes just rolled over
      hours.increment();
    setTimeString();
  }  // end of minIncrement()


}  // end of ClockDisplay class
