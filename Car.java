
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Car extends Thread implements Runnable {           // Diameter of Car
public static final int SIZE = 9;                               // max distance can move
private static final int MAXDX = 10;
private int finishLine;                                         // Boundary
private boolean finished = false;                               // boolean to determine if at finishline
private boolean pausec = false;
private Dimension size;

private Point location = new Point(50, 50);
private RaceTrack frame;
private JPanel panel;                                          // my drawing panel

int R = (int)(Math.random()*256);
int G = (int)(Math.random()*256);
int B= (int)(Math.random()*256);
private Color color = new Color(R, G, B);                      // random color, but can be bright or dull
public Car() {}                                                // default constructor

public Car(RaceTrack f, JPanel p, Color c, Point loc) {
frame = f;
panel = p;
size = p.getSize();                                            
color = c;                                                     // set color
location = loc;                                                // set initial location
} //

public void draw(Color color) {
Graphics g = panel.getGraphics();
g.setXORMode(color);                                           // using XOR can draw or erase

g.fillRect(location.x, location.y, SIZE+1, SIZE);
}



public void move() {
int dx = (int)(Math.random() * MAXDX);                         // figure out new location
location.x = location.x + dx;
finished = location.x >= size.width - SIZE;
if (finished) frame.stopRace();
}

public void run() {
finished = false;
while (!finished && !frame.raceOver()) {
draw(color);                                                    // draw color
try {
sleep(50);
}
catch (InterruptedException e) {}
        
draw(color.blue);



pausec = frame.racePaused();

if(pausec){break;}
else{move();}

}        

// if finished 
if (finished) {
location.x = size.width - SIZE;
draw(Color.green);                                              // Change color of the winner
JOptionPane.showMessageDialog(frame, "The winner is highlighted in purple");

}
else                                                            // else leave the color alone for non winners
draw(color);
}
} 
