
// TicketMachine.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/**
 * TicketMachine models a ticket machine.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2006.03.30
 */


public class TicketMachine
{
  private int price;    // price of a ticket
  private int balance;  // amount entered by customer
  private int total;    // total money in machine


  public TicketMachine(int ticketCost)
  { price = ticketCost;  // set the ticket price
    balance = 0;
    total = 0;
  }


  public int getPrice()
  {  return price; }

  public int getBalance()
  { return balance; }

  public int getTotal()
  {  return total;  }


  public void insertMoney(int amount)
  // process money inserted into the machine
  {
    if (amount > 0)
      balance = balance + amount;
    else
      System.out.println("Use a positive amount: " + amount);
  }


  public void printTicket()
  {
    if (balance >= price) {   // if enough money inserted
      // Simulate the printing of a ticket.
      System.out.println("##################");
      System.out.println("# Ticket");
      System.out.println("# " + price + " cents.");
      System.out.println("##################");
      System.out.println();

      // Update the total collected with the price.
      total = total + price;
      // Reduce the balance by the prince.
      balance = balance - price;
    }
    else   // report error
      System.out.println(
          "You must insert at least: " + (price - balance) + " more cents.");
  }  // end of printTicket()


  public int refundBalance()
  {
    int amountToRefund = balance;
    balance = 0;    // clear the ticket machine's balance
    return amountToRefund;    // return balance amount
  }

}  // end of TicketMachine class
