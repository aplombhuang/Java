
package finalex2_1;


import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Finalex2_1 {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) throws IOException {

        ArrayList<points> allPoints = new ArrayList<>();

        ArrayList<points> first = new ArrayList<>();
        ArrayList<points> second = new ArrayList<>();
        ArrayList<points> third = new ArrayList<>();
        ArrayList<points> fourth = new ArrayList<>();
        ArrayList<points> fifth = new ArrayList<>();
        ArrayList<points> sixth = new ArrayList<>();
        ArrayList<points> seventh = new ArrayList<>();

        File dayOneFile = new File("Ex1_data.txt");
        BufferedReader reader = new BufferedReader(new FileReader(dayOneFile));

        double learningConstant = 0.03;

        // Neuron Locations
        points firstCluster = new points(-3.0, -1.0, 1);
        points secondCluster = new points(-1.5, -0.5, 2);
        points thirdCluster = new points(0.0, 0.0, 3);
        points fourthCluster = new points(0.5, 0.2, 4);
        points fifthCluster = new points(1.0, 0.4, 5);
        points sixthCluster = new points(1.5, 0.6, 6);
        points seventhCluster = new points(2.0, 0.8, 7);

        ArrayList<points> clusters = new ArrayList<>();

        clusters.add(firstCluster);
        clusters.add(secondCluster);
        clusters.add(thirdCluster);
        clusters.add(fourthCluster);
        clusters.add(fifthCluster);
        clusters.add(sixthCluster);
        clusters.add(seventhCluster);

        String line;
        while((line = reader.readLine()) != null){
            String[] values = line.split(",");
            double x = Double.parseDouble(values[0]);
            double y = Double.parseDouble(values[1]);

            allPoints.add(new points(x, y));
        }

        for(int i = 0; i < 10000; i++) {
            for (points p : allPoints) {
                points closest = new points(Double.MAX_VALUE, Double.MAX_VALUE);

                for (points cluster : clusters) {
                    points distance_new = p.distanceTo(cluster);
                   points distance_old = p.distanceTo(closest);

                    if (Math.abs(distance_new.square()) < Math.abs(distance_old.square())) {
                        closest = cluster;
                        p.clusterClosestTo = cluster.ID;
                    }
                }

                switch (p.clusterClosestTo) {
                    case 1: {
                        firstCluster.updateWeights(p, learningConstant);
                        break;
                    }
                    case 2: {
                        secondCluster.updateWeights(p, learningConstant);
                        break;
                    }
                    case 3: {
                        thirdCluster.updateWeights(p, learningConstant);
                        break;
                    }
                    case 4: {
                        fourthCluster.updateWeights(p, learningConstant);
                        break;
                    }
                    case 5:
                        fifthCluster.updateWeights(p, learningConstant);
                        break;
                    case 6:
                        sixthCluster.updateWeights(p, learningConstant);
                        break;
                    case 7:
                        seventhCluster.updateWeights(p, learningConstant);
                        break;
                }
            }

            learningConstant -= 0.000001;
        }

        for(points p : allPoints){
            switch (p.clusterClosestTo){
                case 1:
                    first.add(p);
                    break;
                case 2:
                    second.add(p);
                    break;
                case 3:
                    third.add(p);
                    break;
                case 4:
                    fourth.add(p);
                    break;
                case 5:
                    fifth.add(p);
                    break;
                case 6:
                    sixth.add(p);
                    break;
                case 7:
                    seventh.add(p);
                    break;
            }
        }

        System.out.println("Cluster 1st: "+ firstCluster);
        System.out.println("Cluster 2nd: "+secondCluster);
        System.out.println("Cluster 3rd: "+thirdCluster);
        System.out.println("Cluster 4th: "+fourthCluster);
        System.out.println("Cluster 5th: "+fifthCluster);
        System.out.println("Cluster 6th: "+sixthCluster);
        System.out.println("Cluster 7th: "+seventhCluster);


    }
}

