/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *
 * @author Leander van den Heuvel, s4749707
 * @author Jape van Bussel, s4805879
 */
public class SPMLSearch {
    PriorityQueue<Edge> queue = new PriorityQueue();
    public static ArrayList<Vertex> visVertex = new ArrayList();
    public static ArrayList<Vertex> unvisVertex = new ArrayList();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        unvisVertex = graph.getAllVertex();
        Random random = new Random();
        int start = random.nextInt(9);
        System.out.println(start);
        Vertex startVertex = unvisVertex.get(start);
        unvisVertex.remove(start);
        visVertex.add(startVertex);
        System.out.println(unvisVertex);
    }
}
