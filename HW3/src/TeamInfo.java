/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aplomb
 */
public class TeamInfo {
    
    private String Name;
    private String League;
    private int Goal;
    private double SPG;//shots per game
    private double PP; //Possession Percentage
    private double PSP;//Pass Success Percentage
    private double AW; //Aerials Won
     
    public TeamInfo(){}
    
    public void setName (String str){Name = str;}
    public String getName (){return Name;}
            
    public void setLeague(String str){League = str;}
    public String getLeague(){return League;}
           
    public void setGoal(int n){Goal = n;}
    public int getGoal(){return Goal;}
            
    public void setSPG(double db){SPG = db;}
    public double getSPG(){return SPG;}
            
    public void setPP(double db){PP = db;}
    public double getPP(){return PP;}
            
    public void setPSP(double db){PSP = db;}
    public double getPSP(){return PSP;}
            
    public void setAW(double db){AW = db;}
    public double getAW(){return AW;}    

@Override
public String toString() {
    return " Team Name: " + this.getName() + 
           ", Team League : " + this.getLeague()+
            ", Team Goals : " + this.getGoal()+
            ", Shots per Game : " + this.getSPG()+
            ", Possession Percentage : " + this.getPP()+
            ", Pass Success Percentage : " + this.getPSP()+
            ", Aerials Won : " + this.getAW() + "\n";
}    
    
}
