/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

/**
 *
 * @author Jaap van Bussel
 * @author Leander van den Heuvel
 */
public class Edge {
    private final int x1,x2;
    private final int y1,y2;
    private final Vertex vertex1, vertex2;
    
    public Edge(Vertex vertex1, Vertex vertex2) {
        x1 = vertex1.getXPos();
        y1 = vertex1.getYPos();
        x2 = vertex2.getXPos();
        y2 = vertex2.getYPos();     
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }
    
    public double getDistance() {
        int distX = Math.abs(x1-x2);
        int distY = Math.abs(y1-y2);
        return pythagoras(distX,distY);
    }
    
    private double pythagoras(int x, int y) {
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
    public Vertex[] getVertices() {
        Vertex[] vertices = {vertex1, vertex2};
        return vertices;
    }
}
