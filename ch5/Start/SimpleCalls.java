
// SimpleCalls.java
// Andrew Davison, Nov. 2007, ad@fivedots.coe.psu.ac.th

/* An example of call by value for parameters using primitive
   types.

   The use of static in squareBad() and squareGood() is so
   main() can call them without creating an object first.
*/

public class SimpleCalls
{
  public static void main(String[] args) 
  {
    int x = 3;
    System.out.println("1. x = " + x);
    // squareBad(x);
    x = squareGood(x);
    System.out.println("2. x = " + x);
  }  // end of main()

  private static void squareBad(int x)
  {
    System.out.println("sqBad 1. x = " + x);
    x = x*x;
    System.out.println("sqBad 2. x = " + x);
  }

  private static int squareGood(int x)
  {
    System.out.println("sqGood 1. x = " + x);
    x = x*x;
    System.out.println("sqGood 2. x = " + x);
    return x;
  }

} // end of SimpleCalls class

