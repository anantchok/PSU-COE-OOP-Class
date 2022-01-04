
// LogAnalyzer.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/**
 * Read log data file and analyses its hourly access patterns.
 * The log file consists of lines of the form:
 *    year month day hour minute
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */


public class LogAnalyzer
{
  private static final String LOG_FNM = "weblog.txt";

  private int[] hourCounts; // stores hourly access counts
  private LogfileReader reader;


  public LogAnalyzer()
  { 
    hourCounts = new int[24];
    reader = new LogfileReader(LOG_FNM);
    analyzeHourlyData();
  }  // end of LogAnalyzer()


  private void analyzeHourlyData()
  {
    while (reader.hasMoreEntries()) {
      LogEntry entry = reader.nextEntry();
      int hour = entry.getHour();
      hourCounts[hour]++;
    }
  }  // end of analyzeHourlyData()



  public void printHourlyCounts()
  {
    System.out.println("-----------------------------------------------");
    System.out.println("Hour: Count");
    for (int hour = 0; hour < hourCounts.length; hour++)
      System.out.println(hour + ": " + hourCounts[hour]);
    System.out.println("-----------------------------------------------");
  }  // end of printHourlyCounts()
    

  public void printData()
  { reader.printData(); }

}  // end of LogAnalyzer class
