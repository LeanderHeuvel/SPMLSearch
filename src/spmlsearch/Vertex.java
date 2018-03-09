/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

import java.util.ArrayList;

/**
 * 
 * @author Leander van den Heuvel, s4749707
 * @author Jaap van Bussel, s4805879
 */
public class Vertex{
    private String name;
    private int key;
    private ArrayList<Edge> connections;

    public Vertex (String name, int key, ArrayList<Edge> connections){
        this.name = name;
        this.key = key;
        this.connections = connections;
    } 
    
    public ArrayList<Edge> getConnections(){
        return connections;
    }
    
    public Edge getConnectionsEdge(int i){
        return connections.get(i);
    }
    
    public String getName(){
        return name;
    }
    
    public int getKey(){
        return key;
    }
    
    public void setKey(int key){
        this.key = key;
    }
    
    @Override
    public String toString(){
        String string = name+", key:"+key;
        //string = string+connections.toString()+"\n";
        return string;
    }
}
