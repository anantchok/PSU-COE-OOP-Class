
// Lot.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th


/* Model a lot in an auction
   Each lot has a ID number that is used to access it.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */


public class Lot
{
  private int idNum;
  private String description;
  private Bid highestBid;


  public Lot(int idNo, String desc)
  { idNum = idNo;
    description = desc;
    highestBid = null;  // no object
  }


  public boolean bidFor(Bid bid)
  /* Attempt to bid for this lot. A successful bid
     must have a value higher than any existing bid. */
  {
    if ((highestBid == null) || (bid.getValue() > highestBid.getValue())) {
      highestBid = bid;      // This bid is the best so far.
      return true;
    }
    else
      return false;
  }  // end of bidFor()
    

  public String toString()
  // return lot details as a string
  {
    String details = idNum + ": " + description;
    if (highestBid != null)
      details += "    Bid: " + highestBid.getValue() + " by " +
                               highestBid.getBidderName();
    else
      details += "    (No bid)";
    return details;
  }  // end of toString()


  public int getIdNum()
  { return idNum; }

  public String getDescription()
  { return description;  }

  public Bid getHighestBid()
  { return highestBid; }

}  // end of Lot class
