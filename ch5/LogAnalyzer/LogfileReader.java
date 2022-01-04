
// LogfileReader.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/* Read information from a log file and store in a list of LogEntry's
 * The log file consists of lines of the form:
 *    year month day hour minute
 * Log entries are sorted into ascending order of date.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */


import java.io.*;
import java.util.*;


public class LogfileReader
{
  private ArrayList<LogEntry> entries;
  private Iterator<LogEntry> dataIterator;
    

  public LogfileReader(String filename)
  {
    entries = new ArrayList<LogEntry>();
        
    try {
      Scanner logfile = new Scanner(new File(filename));
      while (logfile.hasNextLine()) {
        String logline = logfile.nextLine();
        LogEntry entry = new LogEntry(logline);  // make line into an entry
        entries.add(entry);
      }
      logfile.close();
    }
    catch (FileNotFoundException e) 
    { System.out.println(e); }

    Collections.sort(entries);   // sort entries into ascending order

    // create iterator for supplying the entries
    dataIterator = entries.iterator();
  }  // end of LogfileReader()
    

  public boolean hasMoreEntries()
  // are there more entries to supply?
  {   return dataIterator.hasNext(); }
    

  public LogEntry nextEntry()
  // return the next entry
  { return dataIterator.next(); }
    
    
  public void printData()
  { 
    System.out.println("-----------------------------------------------");
    System.out.println("Log File Data");
    for (LogEntry entry : entries)
      System.out.println(entry);
    System.out.println("-----------------------------------------------");
  }  // end of printData()

}  // end of LogfileReader class
