
// TestStack.java
// Andrew Davison, ad@fivedots.coe.psu.ac.th, November 2007


public class TestStack 
{  
  public static void main(String args[])
  { 
    Stack stk = new Stack();
    stk.push(42);
    stk.push(17);
    stk.pop();
    System.out.println("Top value is " + stk.topOf());
  }
  
} // end of TestStack.java
