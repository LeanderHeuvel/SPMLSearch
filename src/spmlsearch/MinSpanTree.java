/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *
 * @author Leander van den Heuvel, s4749707
 */
public class MinSpanTree {
    private Graph graph;
    private ArrayList<Vertex> unvisVertices;
    private ArrayList<Vertex> allVertices;
    private ArrayList<Vertex> visVertices;
    private Random random;
    private PriorityQueue<Vertex> queue;
    private static Comparator<Vertex> comparator; 
    
    public MinSpanTree(Graph graph){
        this.graph = graph;
        visVertices = new ArrayList();
        allVertices = graph.getAllVertex();
        unvisVertices = graph.getAllVertex();
        random = new Random();
        comparator = new KeyComparator();
        queue = new PriorityQueue<Vertex>(9, comparator);
        
    }
    public void start() {
        ObjectObserver output = new OutputHandler();
        int start = random.nextInt(9);
        start = 0;
        Vertex startVertex = allVertices.get(start);
        startVertex.setKey(0);
        unvisVertices.remove(startVertex);
        visVertices.add(startVertex);
        while(!unvisVertices.isEmpty()){
            output.showUnvisited(unvisVertices);
            fillQueue();
            output.showUnvisited(unvisVertices);
            Vertex expandedVertex = queue.remove();
            output.showExpanded(expandedVertex);
            output.showUnvisited(unvisVertices);
            unvisVertices.remove(expandedVertex);
            output.showUnvisited(unvisVertices);
            visVertices.add(expandedVertex);
            output.showUnvisited(unvisVertices);
            queue.clear();
        }
    }
    public Vertex getVertexByName(String s){
        for(int i = 0; i<allVertices.size(); i++){
            if(s.equals(allVertices.get(i).getName())){
                return allVertices.get(i);
            }
        }
        return null;
    }
    public void fillQueue(){
        for(int i = 0; i<visVertices.size(); i++){
            Vertex curVertex = visVertices.get(i);
            for(int j = 0; j<curVertex.getConnections().size(); j++){
                Vertex neighbour = getVertexByName(curVertex.getConnectionsEdge(j).getToName());//the connecting vertex
                if(!isVisited(neighbour)){
                    int key = curVertex.getConnectionsEdge(j).getCost();//the cost of that edge
//                    System.out.print("current "+curVertex);
//                    System.out.print("neighbour "+neighbour);
//                    System.out.println("cost"+curVertex.getConnectionsEdge(j).getCost());
//                    System.out.println("key "+key+"\n");
                    neighbour.setKey(key);
                    queue.add(neighbour);
                }
            }
        }   
    }
    public boolean isVisited(Vertex vertex){
        for(int i = 0; i<visVertices.size(); i++){
            if(vertex==visVertices.get(i)){
                return true;
            }
        }
        return false;
    }
}
