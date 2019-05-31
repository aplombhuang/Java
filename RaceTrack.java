


import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;



public class RaceTrack extends JFrame
implements ActionListener{
private JButton start = new JButton("Start");
private JButton pause = new JButton("Pause");
private JButton reset = new JButton("Reset");
private JPanel controls = new JPanel();
private JPanel raceCourse = new JPanel();
private Border b = BorderFactory.createEtchedBorder(); // Stores references to the Cars
private Car stable[] = new Car[3]; // Used to control the race
private boolean raceIsOver = false;
private boolean pauseb = false;




public RaceTrack() {
 setResizable(false);
 setTitle("Race Track");
start.addActionListener(this);
pause.addActionListener(this);
reset.addActionListener(this);
controls.add(start);
controls.add(pause);
controls.add(reset);
getContentPane().add(controls,"North");
getContentPane().add(raceCourse,"Center");
raceCourse.setBorder(
UIManager.getBorder("Menu.border"));
} // RaceTrack

public void actionPerformed(ActionEvent e) {
int col = 30; // Initial color = 30,30,30 (gray)
if (e.getSource() == start){
 pauseb = false;
for (int k = 0; k < stable.length; k++) {
stable[k] = new Car(this, raceCourse,
new Color(col,col,col), new Point(10, 40 + 20 * k));
stable[k].start();
col += 40; // Make the color a bit more gray
}
}
else if(e.getSource() ==pause)
{
  pauseb = true;
}
else {
raceIsOver = false;
repaint();
}
}

public synchronized void stopRace() {
raceIsOver = true;
}

public synchronized void pauseRace() {
pauseb = true;
}

public synchronized boolean racePaused() {
return pauseb;
}

public synchronized boolean raceOver() {
return raceIsOver;
}

public static void main(String args[]) {
RaceTrack rt = new RaceTrack();
rt.setSize(500,200);
rt.setVisible(true);
} // main()
} // RaceTrack
