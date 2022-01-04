
// Bid.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th


/* An auction bid.
 * It contains the bidder's name and the amount bid.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */


public class Bid
{
  private String bidderName;
  private long value; // could be a large number so use long


  public Bid(String nm, long val)
  { bidderName = nm;
    value = val;
  }

  public String getBidderName()
  { return bidderName;  }

  public long getValue()
  { return value;  }

}  // end of Bid class
