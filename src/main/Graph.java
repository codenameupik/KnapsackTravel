package main;

/*
 * Robb Dooling
 * robbdooling@gmail.com
 * http://www.cs.rit.edu/~rlc/Courses/Algorithms/Projects/20131/Proj1/proj1.html
 * http://www.cs.rit.edu/~rlc/Courses/Algorithms/Projects/20131/Proj2/proj2.html
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.text.*;

public class Graph {
    
    // n = number of nodes
    int n; 
    private ArrayList<Vertex> vertices;
    private double[][] adjacencyMatrix;
    private DecimalFormat df = new DecimalFormat("0.00");
        
    /* Constructor takes 2 parameters:
        an int representing the number of nodes
        a long to use for the random number generator
    */
    public Graph(int _n, long seed) {
        
        // intialize number of nodes in graph
        n = _n;
        
        // initialize data structures 
        vertices = new ArrayList<Vertex>();
        adjacencyMatrix = new double[n][n];
        
        // use seed to create random number generator
        Random xGenerator = new Random(seed);
        Random yGenerator = new Random(2 * seed);        
        
        // generate unique coordinates for vertices
        for (int i = 0; i < n; i++) {
            Vertex v = generateUniqueCoordinate(xGenerator, yGenerator);
	    v.setNumber(i);
            vertices.add(v);
        }
        
        // generate adjacency matrix based on the vertices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = getDist(vertices.get(i), vertices.get(j));
            }
        }
	
    }
            
    public Boolean isInDescendingOrder(ArrayList<Integer> path) {
        boolean isDescending = true;
        for (int i = 0; i < path.size() - 1; i++) {
            if (path.get(i) < path.get(i+1)) {
                isDescending = false;
            }
        }
        return isDescending;
    }
        
    /* generateUniqueCoordinate takes 3 parameters:
        an int n with the number of nodes (to use for the random number generator)
        a Random number generator for x values
        a Random number generator for y values
    */
    public Vertex generateUniqueCoordinate(Random xGenerator, Random yGenerator) {
        // generate a random x and y
        int x = xGenerator.nextInt(n);
        int y = yGenerator.nextInt(n);
        Vertex v = new Vertex(x, y);
        boolean isUnique = true;
        
        // check if x does not already exist in vertices
        if (vertices.size() > 0) {
            for (int j = 0; j < vertices.size(); j++) {
                if (vertices.get(j).x() == x) {
                    // if x already exists, start over (generate new coordinates)
                    v = generateUniqueCoordinate(xGenerator, yGenerator);
                }
            }
        }
        return v;
    }

    /* getDistance takes 2 parameters:
        a starting Vertex (x, y coordinate)
        an ending Vertex (x, y coordinate)
        returns the absolute distance between the two
    */
    public double getDist(Vertex a, Vertex b) {
        double yDistance = Math.abs(b.y() - a.y());
        double xDistance = Math.abs(b.x() - a.x());
        // distance = square root of (yDistance^2 + xDistance^2)
        double distance = Math.sqrt(Math.pow(yDistance, 2) + Math.pow(xDistance, 2));
        return distance;
    }       
	
    public Vertex getVertex(int i) {
	return vertices.get(i);
    }
    public ArrayList<Vertex> getVertices() {
        return vertices;    
    }
    
    public double[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }
        
    public String getMatrixString() {
        String matrixString = "";
        // print numbered columns (will look like this:   0   1   2...)
	for (int i = 0; i < n; i++) {
	    matrixString += "      " + i;
	}
	
	// Print each row
	for (int i = 0; i < n; i++)
	{
            matrixString += "\n\n" + i;
	    for (int j = 0; j < n; j++)
	    {
                matrixString += "   " + df.format(adjacencyMatrix[i][j]);
	    }
	}
        return matrixString;
    }
        
    public String getVerticesString(ArrayList<Vertex> verticesToPrint) {
        String verticesString = "";
        for (int i = 0; i < verticesToPrint.size(); i++) {
	    verticesString += "v" + verticesToPrint.get(i).getNumber()
			    + ": (" + verticesToPrint.get(i).x()
			    + "," + verticesToPrint.get(i).y() + ") ";
	}
        verticesString += "\n";
        return verticesString;
    }
    
    public ArrayList<Vertex> sortVertices(ArrayList<Vertex> toSort) {
	
	Vertex[] vertexArray = new Vertex[toSort.size()];
	toSort.toArray(vertexArray);
	Vertex[] emptyArray = new Vertex[toSort.size()];
		
	sort(vertexArray, 0, vertexArray.length);
	
	ArrayList<Vertex> toReturn = new ArrayList<Vertex>(Arrays.asList(vertexArray));
	return toReturn;
    }
    
    // The below is a modification to existing Java source code to sort based on x-coordinates
    // Java code from http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/Arrays.java
    public static void sort(Vertex[] src, int off, int len) {
	
	// Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j = i; j > off && src[j-1].x() > src[j].x(); j--)
                    swap(src, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int n = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(src, l,     l+s, l+2*s);
                m = med3(src, m-s,   m,   m+s);
                n = med3(src, n-2*s, n-s, n);
            }
            m = med3(src, l, m, n); // Mid-size, med of 3
        }
        int v = src[m].x();

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && src[b].x() <= v) {
                if (src[b].x() == v)
                    swap(src, a++, b);
                b++;
            }
            while (c >= b && src[c].x() >= v) {
                if (src[c].x() == v)
                    swap(src, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(src, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(src, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(src, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            sort(src, off, s);
        if ((s = d-c) > 1)
            sort(src, n-s, s);
    }
    
    // from http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/Arrays.java
    private static void swap(Vertex[] src, int a, int b) {
        Vertex t = src[a];
        src[a] = src[b];
        src[b] = t;
    }
    
    /**
     * Swaps x[a .. (a+n-1)] with x[b .. (b+n-1)].
     */
     // from http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/Arrays.java
    private static void vecswap(Vertex[] src, int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(src, a, b);
    }
    
    /**
     * Returns the index of the median of the three indexed longs.
     */
    // from http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/Arrays.java
  
    private static int med3(Vertex[] src, int a, int b, int c) {
        return (src[a].x() < src[b].x() ?
                (src[b].x() < src[c].x() ? b : src[a].x() < src[c].x() ? c : a) :
                (src[b].x() > src[c].x() ? b : src[a].x() > src[c].x() ? c : a));
    }
}