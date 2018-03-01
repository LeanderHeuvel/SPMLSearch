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
    ArrayList<Vertex> visVertex = new ArrayList<>();
    ArrayList<Vertex> unvisVertex = new ArrayList<>();
    ArrayList<Edge> edges = new ArrayList<>();
    PriorityQueue<Edge> queue = new PriorityQueue();
    
    public Graph(ArrayList<Vertex> visVertex, ArrayList<Vertex> unvisVertex, ArrayList<Edge> edges, PriorityQueue<Edge> queue){
        
    }

}
