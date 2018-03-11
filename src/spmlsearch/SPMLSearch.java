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
 * @author Jape van Bussel, s4805879
 */
public class SPMLSearch {
    private static Comparator<Vertex> comparator = new KeyComparator();
    private static PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>(9, comparator);
    private static ArrayList<Vertex> visVertices = new ArrayList();
    private static ArrayList<Vertex> unvisVertices = new ArrayList();
    private static ArrayList<Vertex> allVertices = new ArrayList();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        allVertices = graph.getAllVertex();
        unvisVertices = graph.getAllVertex();
        Random random = new Random();
        int start = random.nextInt(9);
        start = 0;
        Vertex startVertex = allVertices.get(start);
        startVertex.setKey(0);
        unvisVertices.remove(startVertex);
        visVertices.add(startVertex);
        while(!unvisVertices.isEmpty()){
            System.out.println("!"+unvisVertices);
            fillQueue();
            System.out.println("!!"+unvisVertices);
            Vertex expandedVertex = queue.remove();
            System.out.println("!!!"+unvisVertices);
            unvisVertices.remove(expandedVertex);
            System.out.println("!!!!"+unvisVertices);
            visVertices.add(expandedVertex);
            System.out.println("!!!!!"+unvisVertices);
            queue = new PriorityQueue<Vertex>(9, comparator);
        }
    }
    
    public static Vertex getVertexByName(String s){
        for(int i = 0; i<allVertices.size(); i++){
            if(s.equals(allVertices.get(i).getName())){
                return allVertices.get(i);
            }
        }
        return null;
    }
    
    public static void fillQueue(){
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
    
    public static boolean isVisited(Vertex vertex){
        for(int i = 0; i<visVertices.size(); i++){
            if(vertex==visVertices.get(i)){
                return true;
            }
        }
        return false;
    }
        
//        for(int i = 0; i<startVertex.getConnections().size(); i++){//every connection with the new vertex
//            String frontierVertexName = startVertex.getConnectionsEdge(i).getToName();
//            for(int j = 0; j<unvisVertices.size(); j++){//every vertex that could be the new vertex
//                if(unvisVertices.get(j).getName().equals(frontierVertexName)){//get the vertex that belongs to the connection name
//                    frontier.add(unvisVertices.get(j));
//                }
//            }
//        }
//        
//        while(unvisVertices.size()>0){
//            System.out.println("\n\nFrontier");
//            System.out.println(frontier);
//            System.out.println("\nUnvisited");
//            System.out.println(unvisVertices);
//            System.out.println("\nVisited");
//            System.out.println(visVertices);
//            
//            int pos = closestVertexIndex();
//            System.out.println("pos: "+pos);
//            Vertex newVisitedVertex = frontier.get(pos);
//            visVertices.add(newVisitedVertex);
//            frontier.remove(pos);
//            for(int i = 0; i<unvisVertices.size(); i++){
//                if(newVisitedVertex.getName().equals(unvisVertices.get(i).getName())){
//                    unvisVertices.remove(i);
//                }
//            }
//            
//            //fill frontier
//            for(Edge newVertexEdge : newVisitedVertex.getConnections()){
//                String frontierVertexName = newVertexEdge.getToName();
//                for(int i = 0; i<unvisVertices.size(); i++){
//                    if(unvisVertices.get(i).getName().equals(frontierVertexName)){
//                        frontier.add(unvisVertices.get(i));
//                    }
//                }
//            }
//            
//        }
//    }
//    
//    public static int closestVertexIndex(){
//        String fromNameMinCost = null;
//        String toNameMinCost = null;
//        int minCost = 20;
//        for(int i = 0; i<visVertices.size(); i++){
//            //for(int j = 0; j<visVertex.get(i).hashCode(); i++)
//            Vertex visited = visVertices.get(i);
//            ArrayList<Edge> connections = visited.getConnections();
//            for(int j = 0; j<connections.size(); j++){
////                Vertex frontierVertex = frontier.get(j);
////                String frontierName = frontier.get(j).getName();
//                for (Vertex frontierVertex : frontier) {
//                    if(frontierVertex.getName().equals(connections.get(j).getToName())){
////                        if(connections.get(j).getCost()<minCost){
//                        int currentCost = connections.get(j).getCost();
//                        if(currentCost<minCost){
//                            minCost = currentCost;
//                            toNameMinCost = connections.get(j).getToName();
//                            fromNameMinCost = frontierVertex.getName();
//                        }                        
//                    }
//                }                
//            }
//        }      
//        System.out.println(fromNameMinCost+" to "+toNameMinCost);
//        for(int i = 0; i<frontier.size(); i++){
//            if(frontier.get(i).getName().equals(toNameMinCost)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    
//    public static ArrayList<frontierVertex> fillFrontier(){
//        for(int i = 0; i<visVertices.size(); i++){//every vertex that has been expanded
//            Vertex visVertex = visVertices.get(i);
//            for(int j = 0; j<visVertex.getConnections().size(); j++){//every vertex that could be the new vertex
//                if(unvisVertices.get(j).getName().equals(frontierVertexName)){//get the vertex that belongs to the connection name
//                    
//                }
//            }
//        }
//        return frontier;
//    }
}
