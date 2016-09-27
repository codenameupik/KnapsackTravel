/*package main;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Vertex implements Comparable<Vertex>
{
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertex other)
    {
        return Double.compare(minDistance, other.minDistance);
    }

}


class Edge
{
    public final Vertex target;
    public final double weight;
    public Edge(Vertex argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}

public class Dijkstra
{
    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
    vertexQueue.add(source);

    while (!vertexQueue.isEmpty()) {
        Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
            {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
        if (distanceThroughU < v.minDistance) {
            vertexQueue.remove(v);

            v.minDistance = distanceThroughU ;
            v.previous = u;
            vertexQueue.add(v);
        }
            }
        }
    }

    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args)
    {
        // mark all the vertices 
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");


        // set the edges and weight
        A.adjacencies = new Edge[]{ new Edge(B, 8) };
        A.adjacencies = new Edge[]{ new Edge(C, 11) };
        A.adjacencies = new Edge[]{ new Edge(D, 11) };
        B.adjacencies = new Edge[]{ new Edge(A, 23) };
        B.adjacencies = new Edge[]{ new Edge(C, 40) };
        B.adjacencies = new Edge[]{ new Edge(D, 25) };
        C.adjacencies = new Edge[]{ new Edge(A, 8) };
        C.adjacencies = new Edge[]{ new Edge(B, 40) };
        C.adjacencies = new Edge[]{ new Edge(D, 10) };
        D.adjacencies = new Edge[]{ new Edge(A, 15) };
        D.adjacencies = new Edge[]{ new Edge(B, 18) };
        D.adjacencies = new Edge[]{ new Edge(C, 12) };

        computePaths(A); // run Dijkstra
        System.out.println("Distance to " + D + ": " + D.minDistance + " xx "+A);
        List<Vertex> path = getShortestPathTo(D);
        System.out.println("Path: " + path);
        
    }
}*/