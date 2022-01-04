
// NotebookDemo.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/*
  Demo for Notebook class
*/


public class NotebookDemo
{
  public static void main(String[] args)
  {
    Notebook book = new Notebook();

    System.out.println("Store note: \"Teaching maths\"");
    book.storeNote("Teaching maths");

    System.out.println("Store note: \"Teaching Java\"");
    book.storeNote("Teaching Java");

    System.out.println("No. of notes: " + book.numNotes());

    System.out.println("Note 1: ");
    book.showNote(1);
    System.out.println("Note 2: ");
    book.showNote(2);

    System.out.println("All notes: ");
    book.listNotes();

    System.out.println("Remove Note 0");
    book.removeNote(0);

    System.out.println("No. of notes: " + book.numNotes());
    System.out.println("All notes: ");
    book.listNotes();
  }  // end of main()

} // end of NotebookDemo class
