package main;

/**
 * Represents a graph vertex
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

public class Vertex {
    
    // Hold (x, y) coordinates, this vertex's id number, and the distance to this vertex
    private final int x;
    private final int y;
    private int number;
    private double dist;
    
    public Vertex(int _x, int _y){
        x = _x;
        y = _y;
        number = -1;
        dist = -1;
    }
    
    public int x() {
        return x;
    }
    
    public int y() {
        return y;
    }
    
    public void setNumber(int _number) {
        number = _number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setDist(double _dist) {
        dist = _dist;
    }
    
    public double getDist() {
        return dist;
    }
}