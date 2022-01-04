
// Auction.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/* An auction maintains a list of lots.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */


import java.util.ArrayList;


public class Auction
{
  private ArrayList<Lot> lots; // list of lots in the auction


  public Auction()
  { lots = new ArrayList<Lot>();  }


  public void enterLot(int lotNum, String description)
  { lots.add(new Lot(lotNum, description));  }    // should check uniqueness of lotNum


  public void showLots()
  { for (Lot lot : lots)
      System.out.println(lot.toString());
  }
    

  public void bidFor(int lotNum, String bidderName, long value)
  /* Bid for a lot. A message is printed indicating whether 
     the bid was successful or not.  */
  {
    Lot lot = getLot(lotNum);

    if (lot != null) {
      boolean successful = lot.bidFor( new Bid(bidderName,value) );
      if (successful)   // since bid was high enough
        System.out.println("The bid for lot number " + 
                                      lotNum + " was successful.");
      else {   // report higher bid
        Bid highestBid = lot.getHighestBid();
        System.out.println("Lot number: " + lotNum + 
                         " already has a bid of: " + highestBid.getValue());
      }
    }
  }  // end of bidFor()


  public Lot getLot(int lotNum)
  /* Return the lot with the given number. Return null
     if a lot with this number does not exist.  */
  {
    for (Lot lot : lots)
      if (lot.getIdNum() == lotNum)
        return lot;

    // lot with that number not found
    System.out.println("Lot number: " + lotNum + " does not exist.");
    return null;
  }  // end of getLot()

}  // end of Auction class
