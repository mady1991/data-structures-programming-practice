package run.java.com.javarunprogram.java;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    int V;
    LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void bfs(int s) {
        boolean visted[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visted[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> iterator = adj[s].listIterator();

            while (iterator.hasNext()) {
                int n = iterator.next();
                if (!visted[n]) {
                    visted[n] = true;
                    queue.add(n);
                }
            }
        }


    }


}

public class BFS {


    public static void main(String[] args) {

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.bfs(3);
    }

}
