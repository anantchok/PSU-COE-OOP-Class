
// PassArray.java
// Andrew Davison, Nov. 2007, ad@fivedots.coe.psu.ac.th

/* Example of passing arrays to methods.

*/

public class PassArray 
{
  public static void main(String[] args) 
  {
    int a[] = { 1, 2, 3, 4, 5 };

    System.out.println("Values in the original array:");
    for(int i = 0; i < a.length; i++)
      System.out.print( a[i] + "  ");
    System.out.println();

    modifyArray(a);    // pass array call-by-reference

    System.out.println("Values in the modified array:");
    for(int i = 0; i < a.length; i++)
      System.out.print( a[i] + "  ");
    System.out.println();

    System.out.println("Before: a[3] = " + a[3]);

    modifyElement(a[3]);   // pass call-by-value
   
    System.out.println("After:  a[3] = " + a[3]);
  } // end of main()


  private static void modifyArray(int b[])
  // multiply each element by 2
  {  for (int j = 0; j < b.length; j++)
       b[j] *= 2;
  }
   
   private static void modifyElement(int elem)
   // multiply elem by 2
   {  elem *= 2;  }

}  // end of PassArray class
