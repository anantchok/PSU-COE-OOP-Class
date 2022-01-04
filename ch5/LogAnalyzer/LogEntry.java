
// LogEntry.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th


/* Store the data from a single line of a log file.
 * The log file consists of lines of the form:
 *    year month day hour minute
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */

import java.io.*;
import java.util.*;


public class LogEntry implements Comparable<LogEntry>
{
  private static final int YEAR = 0, MONTH = 1, DAY = 2,  HOUR = 3, MINUTE = 4;
                    // constants for the indicies of dataValues[]

  private int[] dataValues; // stores log line details
              

  public LogEntry(String logline)
  // extract fields from a log line
  {
    dataValues = new int[5];
    try { // scan the logline for integers
      Scanner tokenizer = new Scanner(logline);
      for(int i = 0; i < dataValues.length; i++)
        dataValues[i] = tokenizer.nextInt();
    }
    catch(java.util.NoSuchElementException e) {
      System.out.println("Insuffient data items on log line: " + logline);
    }
  }  // end of LogEntry()


  /*  Individual fields are made available via
      accessors such as getHour() and getMinute().  */

  public int getHour()
  {  return dataValues[HOUR];  }

  public int getMinute()
  { return dataValues[MINUTE]; }
    

  public String toString()
  // return data values as a string
  {
    StringBuffer buffer = new StringBuffer();
    for (int value : dataValues) {
      if (value < 10)
        buffer.append('0');  // add a leading zero on a single digit number
      buffer.append(value);
      buffer.append(' ');
    }
    return buffer.toString().trim(); // drop trailing space
  }  // end of toString()
    
    
  public int compareTo(LogEntry otherEntry)
  /* Compare the date/time combination of this log entry
     with another. Return a negative value if this entry comes 
     before the other, a positive value if this entry comes after the other,
     or 0 if the entries are the same.
   */
  {
    if (otherEntry == this) // same object
      return 0;
    else {   // compare corresponding fields
      for (int i = 0; i < dataValues.length; i++) {
        int diff = dataValues[i] - otherEntry.dataValues[i];
        if (diff != 0)
          return diff;
      }
      // the two entries have identical times
      return 0;
    }
  }  // end of compareTo()

}  // end of LogEntry class
