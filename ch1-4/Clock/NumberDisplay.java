
// NumberDisplay.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/**
 * The NumberDisplay class represents a digital number display that can hold
 * values from zero to a given maxValue. The maxValue can be specified when creating
 * the display. The values range from zero (inclusive) to maxValue-1. If used,
 * for example, for the seconds on a digital clock, the maxValue would be 60, 
 * resulting in display values from 0 to 59. When incremented, the display 
 * automatically rolls over to zero when reaching the maxValue.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */


public class NumberDisplay
{
  private int currValue;
  private int maxValue;   // number at which currValue goes back to 0


  public NumberDisplay(int max)
  {
    maxValue = max;
    currValue = 0;
  }


  public void setValue(int newValue)
  /* Set the currValue of the display to the new value. If the new
     value is less than zero or over the maxValue, do nothing.
  */
  { if ((newValue >= 0) && (newValue < maxValue))
      currValue = newValue;
  }


  public int getValue()
  {  return currValue; }


  public String getDisplayValue()
  // return currValue as a string
  {
    if (currValue < 10)
      return "0" + currValue;   // pad the string with a leading 0
    else
      return "" + currValue;
  }


  public void increment()
  /* Increment currValue, rolling over to zero if the
     maxValue is reached. */
  {  currValue = (currValue + 1) % maxValue; }

}  // end of NumberDisplay class
