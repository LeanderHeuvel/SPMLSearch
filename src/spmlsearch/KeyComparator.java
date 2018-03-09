/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spmlsearch;

import java.util.Comparator;

/**
 *
 * @author jaapv
 */
public class KeyComparator implements Comparator<Vertex>{

    @Override
    public int compare(Vertex v1, Vertex v2) {
        if(v1.getKey() < v2.getKey()) {
            return -1;
        }
        if(v1.getKey() > v2.getKey()) {
            return 1;
        }
        return 0;
    }
}
