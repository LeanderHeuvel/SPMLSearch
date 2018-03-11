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
 */
public class OutputHandler implements ObjectObserver {
    public OutputHandler() {
        
    }

    @Override
    public void showUnvisited(ArrayList<Vertex> unVisVertices) {
        System.out.println("Unvisited vertices: "+unVisVertices);
    }

    @Override
    public void showExpanded(Vertex expanded) {
        System.out.println("Expanded vertex: "+expanded);
    }
}
