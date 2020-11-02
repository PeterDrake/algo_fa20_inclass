package inclass;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Deg {

    public static void main(String[] args) {
        Graph g = readGraph("deg.txt");
        printDegrees(g);
    }

    private static Graph readGraph(String filename) {
        In in = new In(filename);
        int v = in.readInt();
        int e = in.readInt();
        Graph g = new Graph(v + 1);
        for (int i = 0; i < e; i++) {
            int a = in.readInt();
            int b = in.readInt();
            g.addEdge(a, b);
        }
        return g;
    }

    private static void printDegrees(Graph g) {
        for (int i = 1; i < g.V(); i++) {
            StdOut.print(g.degree(i) + " ");
        }
    }

}
