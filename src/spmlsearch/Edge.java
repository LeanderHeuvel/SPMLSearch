/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

import java.util.ArrayList;

/**
 *
 * @author Jaap van Bussel
 * @author Leander van den Heuvel
 */
public class Edge {
    private final Vertex from, to;
    private int cost;
    public Edge(Vertex from, Vertex to, int cost) {  
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public ArrayList <Vertex> getVertices() {
        ArrayList <Vertex> vertices = new ArrayList();
        vertices.add(from);
        vertices.add(to);
        return vertices;
    }
    
}
