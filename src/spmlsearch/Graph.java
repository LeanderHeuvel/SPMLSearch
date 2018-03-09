/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

import java.util.ArrayList;

/**
 *
 * @author jaapv
 */
public final class Graph {
    private final ArrayList<Vertex> allVertex = new ArrayList<>();
    private final int inf = Integer.MAX_VALUE;
    public Graph(){
        fill();       
    }
    
    public ArrayList<Vertex> getAllVertex() {
        return allVertex;
    }
    
    public void fill() {
        int[] costs = {4,8};
        String[] toNames = {"b","h"};
        ArrayList<Edge> edges = new ArrayList<>();
        for(int i = 0; i< costs.length; i++) {
            edges.add(new Edge(toNames[i],costs[i]));
        }        
        allVertex.add(new Vertex("a", inf, edges));
        
        int[] costs1 = {4,11,8};
        String[] toNames1 = {"a","h","c"};
        ArrayList<Edge> edges1 = new ArrayList<>();
        for(int i = 0; i< costs1.length; i++) {
            edges1.add(new Edge(toNames1[i],costs1[i]));
        }
        allVertex.add(new Vertex("b", inf, edges1));
        
        int[] costs2 = {7,4,2,8};
        String[] toNames2 = {"d","f","i","b"};
        ArrayList<Edge> edges2 = new ArrayList<>();
        for(int i = 0; i< costs2.length; i++) {
            edges2.add(new Edge(toNames2[i],costs2[i]));
        }
        allVertex.add(new Vertex("c", inf, edges2));
        
        int[] costs3 = {9,14,7};
        String[] toNames3 = {"e","f","c"};
        ArrayList<Edge> edges3 = new ArrayList<>();
        for(int i = 0; i< costs3.length; i++) {
            edges3.add(new Edge(toNames3[i],costs3[i]));
        }
        allVertex.add(new Vertex("d", inf, edges3));
        
        int[] costs4 = {9,10};
        String[] toNames4 = {"d","f"};
        ArrayList<Edge> edges4 = new ArrayList<>();
        for(int i = 0; i< costs4.length; i++) {
            edges4.add(new Edge(toNames4[i],costs4[i]));
        }
        allVertex.add(new Vertex("e", inf, edges4));
        
        int[] costs5 = {10,14,4,2};
        String[] toNames5 = {"e","d","c","g"};
        ArrayList<Edge> edges5 = new ArrayList<>();
        for(int i = 0; i< costs5.length; i++) {
            edges5.add(new Edge(toNames5[i],costs5[i]));
        }
        allVertex.add(new Vertex("f", inf, edges5));
        
        int[] costs6 = {2,6,1};
        String[] toNames6 = {"f","i","h"};
        ArrayList<Edge> edges6 = new ArrayList<>();
        for(int i = 0; i< costs6.length; i++) {
            edges6.add(new Edge(toNames6[i],costs6[i]));
        }
        allVertex.add(new Vertex("g", inf, edges6));

        
        int[] costs7 = {1,7,11,8};
        String[] toNames7 = {"g","i","b","a"};
        ArrayList<Edge> edges7 = new ArrayList<>();
        for(int i = 0; i< costs7.length; i++) {
            edges7.add(new Edge(toNames7[i],costs7[i]));
        }
        allVertex.add(new Vertex("h", inf, edges7));

        
        int[] costs8 = {2,6,7};
        String[] toNames8 = {"c","g","h"};
        ArrayList<Edge> edges8 = new ArrayList<>();
        for(int i = 0; i< costs8.length; i++) {
            edges8.add(new Edge(toNames8[i],costs8[i]));
        }
        allVertex.add(new Vertex("i", inf, edges8));
    }
    
    @Override
    public String toString(){
        String string = "";
        for(int i = 0; i<allVertex.size(); i++){
            string = string+allVertex.get(i);
        }
        return string;
    }
}