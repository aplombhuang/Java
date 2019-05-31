/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 17: AppointmentBook
 * This program is class that should work together with the Appointment class
 * This lab is to let us practice using Eclipse
 * ********************************************************************
 */

/** 
 * The main body of the program is given. 
 * We need to add another method, see comments below.
 */ 

import java.util.ArrayList;
import java.text.ParseException;

public class AppointmentBook 
{
 private ArrayList<Appointment> book;
  
  public AppointmentBook(){book = new ArrayList<Appointment>();}
  
  public void addAll(ArrayList<Appointment>list){ book.addAll(list);}
  
  public int getNumAppointments(){return book.size();}
  
  public Appointment getAppointment(int i){return book.get(i);}
  
  public String toString()
  { String out = "";
  
   for(Appointment a : book)
   { 
    out = out + a.toString() + "\n";
   }
   return out;
  }
  
  /*
   * The method below is the the add method requested to be added.
   */ 
  
  public void add(String aDate, String aDescription)throws ParseException
  {
   Appointment app = new Appointment(aDate, aDescription);
   
   book.add(app);
   
  }
}
