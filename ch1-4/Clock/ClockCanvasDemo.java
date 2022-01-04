
// ClockCanvasDemo.java
// Andrew Davison, Nov 2007, ad@fivedots.coe.psu.ac.th

/*
  Graphical Demo for ClockDisplay using Canvas to display the output
*/

import java.awt.*;


public class ClockCanvasDemo
{
  public static void main(String[] args)
  {
    Canvas canvas = new Canvas("Clock Demo", 300, 150, Color.green);
    canvas.setVisible(true);
    canvas.setFont( new Font("Dialog", Font.PLAIN, 96));

    ClockDisplay clock = new ClockDisplay();
    clock.setTime(11, 10);  // set time to 14:10

    while(true) {
      clock.minIncrement();
      canvas.erase();
      canvas.drawString(clock.getTime(), 30, 100);
      canvas.wait(1000);
    }
  }  // end of main()

} // end of ClockCanvasDemo class
