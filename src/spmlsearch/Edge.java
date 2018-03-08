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
    private final String to;
    private int cost;
    
    public Edge(String to, int cost) {  
        this.to = to;
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public String getToName() {
        return to;
    }
    
    @Override
    public String toString(){
        return "cost: "+cost+", to name: "+to;
    }
}


