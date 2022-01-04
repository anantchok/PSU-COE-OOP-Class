
// UseArray.java
// Andrew Davison, Nov. 2007, ad@fivedots.coe.psu.ac.th

/* Declare and allocate an array

*/

import javax.swing.JOptionPane;


public class UseArray 
{
  public static void main(String[] args) 
  {
    int n[];            // declare array
    n = new int[10];    // allocate memory to array
    // no values stored in n[], so will contain 0's 
 
    String output = "Cell      Value\n";
    for(int i = 0; i < n.length; i++) 
      output += "n[" + i + "] == " + n[i] + "\n";

    JOptionPane.showMessageDialog( null, output,
         "Using an Array", JOptionPane.INFORMATION_MESSAGE );
  } // end of main()

}  // end of UseArray class
