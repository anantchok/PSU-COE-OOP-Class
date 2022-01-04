
// Stack.java
// Andrew Davison, ad@fivedots.coe.psu.ac.th, November 2007


public class Stack 
{
  private int store[];   // hidden array impl.
  private int max_len;
  private int top;
  
  public Stack() 
  { 
    store = new int[100];	// default size
    max_len = 99;
    top = -1;
  }


  public boolean push(int number)   
  {
    if (top == max_len)
      return false;
    top++;
    store[top] = number;
    return true;
  }


  public boolean pop()   
  {
    if (top == -1)
      return false;
    top--;
    return true;
  }

  
  public int topOf()
  {  return store[top]; }
  

  public boolean isEmpty()
  { return (top == -1); }
  
  
}  // end of Stack.java
