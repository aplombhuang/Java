/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 17: Appointment
 * This program is a class that works together with the AppointmentBook class.
 * This lab is to let us practice using Eclipse
 * ********************************************************************
 */

/*
 * The program is partially given.Constructor, getter and setter method are created by me.
 */ 

import java.text.DateFormat;
import java.text.ParseException; // this line is added by me
import java.util.Date;

public class Appointment 
{
 private String description;  private Date dates;
 
 DateFormat formatter;
  
 public Appointment(){descrition = ""; dates = null;}
 
 public Appointment(String aDate, String aDescription)throws ParseException
 {
  setDate(aDate);
  
  setDescription(aDescription);
 }
 
 public void setDate(Date aDates){dates = aDates; }
 
 public void setDate(String dateString) throws ParseException
 {
  formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT);
  
  dates = formatter.parse(dateString);
 }
 
 public void setDescription(String aDescription)
 {
  description = aDescription;
 }
 
 public Date getDate(){return dates;}
 
 public String getDescription(){return description;}
 
 public String toString()
 {
  return "Appointment[date = "
    + formatter.format(dates)
    + "description = " + description
    + ";" + "]";
 }
 
}
