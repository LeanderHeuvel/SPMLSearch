/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author jaapv
 */
public class Graph {
    ArrayList<Vertex> allVertex = new ArrayList<>();
    private ArrayList<Edge> edges = new ArrayList<>();
    
    public Graph(){
        fill();       
    }
    public ArrayList<Vertex> getAllVertex() {
        return allVertex;
    }
    
    public void fill() {
        int[] costs = {4,8};
        String[] toNames = {"b","h"};
        addVertex("a",costs,toNames);
        
        int[] costs1 = {4,11,8};
        String[] toNames1 = {"a","h","c"};
        addVertex("b",costs1,toNames1);
        
        int[] costs2 = {7,4,2,8};
        String[] toNames2 = {"d","f","i","b"};
        addVertex("c",costs2,toNames2);
        
        int[] costs3 = {9,14,7};
        String[] toNames3 = {"e","f","c"};
        addVertex("d",costs3,toNames3);
        
        int[] costs4 = {9,10};
        String[] toNames4 = {"d","f"};
        addVertex("e",costs4,toNames4);
        
        int[] costs5 = {10,14,4,2};
        String[] toNames5 = {"e","d","c","g"};
        addVertex("f",costs5,toNames5);
        
        int[] costs6 = {2,6,1};
        String[] toNames6 = {"f","i","h"};
        addVertex("g",costs6,toNames6);
        
        int[] costs7 = {2,6,7};
        String[] toNames7 = {"c","g","h"};
        addVertex("i",costs7,toNames7);
        
        int[] costs8 = {1,7,11,8};
        String[] toNames8 = {"g","i","b","a"};
        addVertex("h",costs8,toNames8);
        
    }
    
    public void addVertex(String name, int[] costs, String[] toNames) {
        edges.clear();
        for(int i = 0; i< costs.length; i++) {
            Edge edge = new Edge(toNames[i],costs[i]);
            edges.add(edge);
        }
        Vertex vertex = new Vertex(name, edges);
        allVertex.add(vertex);
    }
    

}
