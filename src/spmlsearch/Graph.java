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
    ArrayList<Vertex> visitedVertex = new ArrayList<>();
    ArrayList<Vertex> unvisitedVertex = new ArrayList<>();
    ArrayList<Edge> edges = new ArrayList<>();
    PriorityQueue<Edge> queue = new PriorityQueue();

}
