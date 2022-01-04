
// Notebook.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/* Maintain an arbitrarily long list of notes in an ArrayList.
   Use a note's index position in the list to access it.
   The index begins at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */


import java.util.ArrayList;


public class Notebook
{
  private ArrayList<String> notes;


  public Notebook()
  {  notes = new ArrayList<String>();  }


  public void storeNote(String note)
  // add a note (a string) to the notebook
  {  notes.add(note); }


  public void removeNote(int noteIdx)
  // Remove a note from the notebook if it exists.
  {
    if ((noteIdx >= 0) && (noteIdx < notes.size())) // a valid note number
      notes.remove(noteIdx);
  }


  public void showNote(int noteIdx)
  {
    if ((noteIdx >= 0) && (noteIdx < notes.size())) // a valid note number
      System.out.println(notes.get(noteIdx));
  }


  public int numNotes()
  {  return notes.size(); }


  public void listNotes()
  { for (String note : notes)
      System.out.println(note);
  }


}  // end of Notebook class
