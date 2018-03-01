/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

/**
 * graph: visited vertices [vertice, x, y], unvisited vertices, edges
 * vertex: x, y
 * edge: x1,y1,x2,y2,length
 * 
 * @author Leander van den Heuvel, s4749707
 * @author Jaap van Bussel, s4805879
 */
public class Vertex{
    private int x;
    private int y;
    
    public Vertex (int x, int y){
        this.x = x;
        this.y = y;
    } 
    
    public int getXPos(){
        return x;
    }
    
    public int getYPos(){
        return y;
    }
}
