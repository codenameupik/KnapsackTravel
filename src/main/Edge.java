package main;

/**
 * Represents a graph edge
 *
 * Created to help solve the traveling salesman problem for the below projects
 * http://www.cs.rit.edu/~rlc/Courses/Algorithms/Projects/20131/Proj1/proj1.html
 * http://www.cs.rit.edu/~rlc/Courses/Algorithms/Projects/20131/Proj2/proj2.html
 * http://www.cs.rit.edu/~rlc/Courses/Algorithms/Projects/20131/Proj3/proj3.html
 * http://www.cs.rit.edu/~rlc/Courses/Algorithms/Projects/20131/Proj4/proj4.html
 *
 * @author Robb Dooling (robbdooling@gmail.com)
 * @version 0.1
 */

import java.text.*;

public class Edge {
    
    // Hold the vertex numbers for the left and right vertices
    private int left;
    private int right;
    private double weight;
    // Only print up to the hundredths place for decimals
    DecimalFormat df = new DecimalFormat("0.00");
    
    public Edge(int _left, int _right, double _weight){
        left = _left;
        right = _right;
        weight = _weight;
    }
    
    public int getLeft() {
        return left;
    }
    
    public int getRight() {
        return right;
    }
    
    public double getDist() {
        return weight;
    }
    
    public String toString() {
        return (String.valueOf(left) + " " + String.valueOf(right) + " weight = " + df.format(weight));
    }
    
    public void setLeft(int _left) {
        left = _left;
    }
    
    public void setRight(int _right) {
        right = _right;
    }
    
    public void setCoords(int _left, int _right) {
        setLeft(_left);
        setRight(_right);
    }
    
    public void setDist(double _weight) {
        weight = _weight;
    }
}