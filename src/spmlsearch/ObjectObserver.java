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
public interface ObjectObserver {
    public void showUnvisited(ArrayList<Vertex> unVisVertices);
    public void showExpanded(Vertex expanded);
}
