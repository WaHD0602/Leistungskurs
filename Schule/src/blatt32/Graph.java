package blatt32;

public class Graph {
    private int[][] adj;
    private int size;
    private int knoten;
    private int edge;

    public Graph(int[][] matrix, int size, int knoten) {
        this.adj = matrix;
        this.size = size;
        this.knoten = knoten;
    }

    public Graph() {
        this.adj = new int[size][size];
        this.size = size;
    }

    public void addVertex() {
        int[][] newMatrix = new int[size][size];
        newMatrix = new int[size+1][size+1];
    }

    public void addEdge(int from, int to) {
        addEdge(from,to,1,false);
    }

    public void addEdge(int from, int to, int weight) {
        addEdge(from,to,weight,false);
    }

    public void addEdge(int from, int to, boolean isDirected) {
        addEdge(from,to,1,isDirected);
    }

    public void addEdge(int from, int to, int weight, boolean isDirected) {
        if (isDirected == false) {
            adj[from][to] = weight;
            adj[to][from] = weight;
        } else {
            adj[from][to] = weight;
        }
    }

}
