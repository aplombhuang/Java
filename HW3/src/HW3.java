/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.stream.*;

public class HW3 {
    public static void main(String[] args) {
		
		TeamInfo team1 = new TeamInfo();
                TeamInfo team2 = new TeamInfo();
                TeamInfo team3 = new TeamInfo();
                TeamInfo team4 = new TeamInfo();
                TeamInfo team5 = new TeamInfo();
                TeamInfo team6 = new TeamInfo();
                TeamInfo team7 = new TeamInfo();
                TeamInfo team8 = new TeamInfo();
                TeamInfo team9 = new TeamInfo();
                TeamInfo team10 = new TeamInfo();
                TeamInfo team11 = new TeamInfo();
                TeamInfo team12 = new TeamInfo();
                TeamInfo team13 = new TeamInfo();
                TeamInfo team14 = new TeamInfo();
                TeamInfo team15 = new TeamInfo();
                TeamInfo team16 = new TeamInfo();
                TeamInfo team17 = new TeamInfo();
                TeamInfo team18 = new TeamInfo();
                TeamInfo team19 = new TeamInfo();
                TeamInfo team20 = new TeamInfo();
                
                team1.setName("Manchester United");
                team1.setLeague("Premier League");
                team1.setGoal(10);
                team1.setSPG(20);
                team1.setPP(58.5);
                team1.setPSP(86.3);
                team1.setAW(18.7);
                
                team2.setName("Paris Saint Germain");
                team2.setLeague("Ligue 1");
                team2.setGoal(14);
                team2.setSPG(18.5);
                team2.setPP(64.2);
                team2.setPSP(90.2);
                team2.setAW(7.3);
                
                team3.setName("Borussia Dortmund");
                team3.setLeague("Bundesliga");
                team3.setGoal(5);
                team3.setSPG(15.5);
                team3.setPP(63);
                team3.setPSP(82.5);
                team3.setAW(25.5);

                team4.setName("Monaco");
                team4.setLeague("Ligue 1");
                team4.setGoal(14);
                team4.setSPG(17.3);
                team4.setPP(55.0);
                team4.setPSP(83.5);
                team4.setAW(19.5);			
                

                team5.setName("Juventus");
                team5.setLeague("Serie A");
                team5.setGoal(8);
                team5.setSPG(17);
                team5.setPP(57.7);
                team5.setPSP(88.4);
                team5.setAW(9.5);	
                
                
                team6.setName("Bayern Munich");
                team6.setLeague("Bundesliga");
                team6.setGoal(5);
                team6.setSPG(16);
                team6.setPP(58.7);
                team6.setPSP(87.6);
                team6.setAW(18);
                
                
                team7.setName("Inter");
                team7.setLeague("Serie A");
                team7.setGoal(6);
                team7.setSPG(15);
                team7.setPP(50.8);
                team7.setPSP(85.3);
                team7.setAW(12);
                
                
                team8.setName("Liverpool");
                team8.setLeague("Premier League");
                team8.setGoal(8);
                team8.setSPG(18.3);
                team8.setPP(55.9);
                team8.setPSP(80.5);
                team8.setAW(18.7);
                
                
                team9.setName("Barcelona");
                team9.setLeague("La Liga");
                team9.setGoal(3);
                team9.setSPG(19);
                team9.setPP(62.9);
                team9.setPSP(89.5);
                team9.setAW(4.5);
                
                
                team10.setName("Athletic Bilbao");
                team10.setLeague("La Liga");
                team10.setGoal(1);
                team10.setSPG(11);
                team10.setPP(52.6);
                team10.setPSP(75.0);
                team10.setAW(24);
                
                						
                team11.setName("Real Madrid");
                team11.setLeague("La Liga");
                team11.setGoal(5);
                team11.setSPG(19);
                team11.setPP(61.8);
                team11.setPSP(89.8);
                team11.setAW(8.5);
                
                
                team12.setName("Huddersfield");
                team12.setLeague("Premier League");
                team12.setGoal(3);
                team12.setSPG(10.7);
                team12.setPP(47.3);
                team12.setPSP(71.7);
                team12.setAW(21.7);
                
                
                team13.setName("RasenBallsport Leipzig");
                team13.setLeague("Bundesliga");
                team13.setGoal(4);
                team13.setSPG(20.5);
                team13.setPP(61.0);
                team13.setPSP(81.8);
                team13.setAW(22);
                
                
                team14.setName("Leganes");
                team14.setLeague("La Liga");
                team14.setGoal(2);
                team14.setSPG(13);
                team14.setPP(48.5);
                team14.setPSP(68.9);
                team14.setAW(27.5);
                
                
                team15.setName("Real Sociedad");
                team15.setLeague("La Liga");
                team15.setGoal(6);
                team15.setSPG(14);
                team15.setPP(53.3);
                team15.setPSP(84.1);
                team15.setAW(16);
                
                
                team16.setName("Lyon");
                team16.setLeague("Ligue 1");
                team16.setGoal(9);
                team16.setSPG(13.5);
                team16.setPP(53.0);
                team16.setPSP(83.4);
                team16.setAW(18);
                
                
                team17.setName("Napoli");
                team17.setLeague("Serie A");
                team17.setGoal(5);
                team17.setSPG(16);
                team17.setPP(56.9);
                team17.setPSP(85.0);
                team17.setAW(13);
                
                
                team18.setName("Atletico Madrid");
                team18.setLeague("La Liga");
                team18.setGoal(7);
                team18.setSPG(8.5);
                team18.setPP(44.4);
                team18.setPSP(78.8);
                team18.setAW(18);
                
                
                team19.setName("AC Milan");
                team19.setLeague("Serie A");
                team19.setGoal(5);
                team19.setSPG(17);
                team19.setPP(62);
                team19.setPSP(88);
                team19.setAW(12.5);
                
                               
                team20.setName("Torino");
                team20.setLeague("Serie A");
                team20.setGoal(4);
                team20.setSPG(11.5);
                team20.setPP(55.1);
                team20.setPSP(82.9);
                team20.setAW(8.5);
                
                
                ArrayList <TeamInfo> someList = new ArrayList<>();
                
                TeamInfo[] temL = new TeamInfo []{team1,team2,team3,team4,team5,team6,team7,team8,team9,team10,team11,team12,team13,team14,team15,team16,team17,team18,team19,team20};
                			
                someList.addAll(Arrays.asList(temL));
                
                System.out.println("Part 1: ");
                
                someList.forEach((TeamInfo t) -> System.out.println(t.getName()+ "   "+ t.getLeague()));
                
                System.out.println("\n Part 2: ");
                
                someList.stream().filter((TeamInfo t) -> t.getGoal()<5).forEach((TeamInfo t) -> System.out.println(t.getName()+ "   "+ t.getLeague()));
                
                System.out.println("\n Part 3: ");
                
                int totalGoal = someList
						.stream()
						.map((TeamInfo t) -> t.getGoal())
						.reduce(0, (a, b) -> a + b);
					System.out.println("Average goal of all team is: "+ (totalGoal/someList.size()));
                
                
                System.out.println("\n Part 4: ");
                
                Collections.sort(someList, (TeamInfo t1, TeamInfo t2) -> t1.getLeague().compareTo(t2.getLeague()));
                
                someList.forEach((TeamInfo t) -> System.out.println(t.getName()+ "   "+ t.getLeague()));
                
                System.out.println("\n Part 5: ");
                
		 Collections.sort(someList, (TeamInfo t1, TeamInfo t2) -> Double.compare(t1.getPSP(), t2.getPSP()));
                 
                 someList.forEach((TeamInfo t) -> System.out.println(t.getName()+ "   "+ t.getPSP()));

                System.out.println("\n Part 6: ");
                
                Collections.sort(someList, (TeamInfo t1, TeamInfo t2) -> t1.getLeague().compareTo(t2.getLeague()));
		
               Collections.sort(someList, (TeamInfo t1, TeamInfo t2) -> Double.compare(t1.getPP(), t2.getPP()));
                
                 someList.forEach((TeamInfo t) -> System.out.println(t.getName()+ "   "+ t.getPP()));
               
                 System.out.println("\n Part 7: ");
                someList.forEach((TeamInfo t) -> t.setAW(0));
                System.out.println(someList);
				
//				
//				totalLength = someList
//						.stream()
//						.map(s -> s.length())
//						.reduce(0, (a, b) -> a + b);
//						System.out.println(totalLength);
//						
//				 totalLength = someList
//								.stream()
//								.mapToInt(String::length)
//								.reduce(0, (a, b) -> a + b);
//								System.out.println(totalLength);
//								

    
    }
    
    
    
}
