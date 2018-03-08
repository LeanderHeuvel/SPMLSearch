/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

import java.util.ArrayList;

/**
 * graph: visited vertices [vertice, x, y], unvisited vertices, edges
 * vertex: x, y
 * edge: x1,y1,x2,y2,length
 * 
 * @author Leander van den Heuvel, s4749707
 * @author Jaap van Bussel, s4805879
 */
public class Vertex{
    private ArrayList<Edge> connections;
    private String name;
    public Vertex (String name, ArrayList connections){
        this.name = name;
        this.connections = connections;
    } 
}
