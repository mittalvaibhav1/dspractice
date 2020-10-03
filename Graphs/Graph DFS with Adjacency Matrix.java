import java.util.*;

class Graph {
    //Graph Varibales.
    int numberOfVertices;
    int[][] adjacencyMatrix;
    //Constructor To Initalize the Graph.
    public Graph(int v) {
        this.numberOfVertices = v;
        this.adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
    }
    // Add an Edge to the Graph.
    public void addEdge(int u,int v) {
        adjacencyMatrix[u][v] = 1;
    }
    //Depth First Traversal.
    public void dfs(int i , boolean[] visited) {
        if(visited[i]==true) {
            return;
        }
        else {
            System.out.print(i+" -> ");
            visited[i] = true;
            for(int j = 0 ; j < numberOfVertices ; j++) {
                if(visited[j]!=true && adjacencyMatrix[i][j]==1) {
                    dfs(j,visited);
                }
            }
        }    
    }
    //Breadth First Traversal.
    public void bfs(int i) {
        
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		boolean visited[] = new boolean[4];
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        
        g.dfs(0,visited);//For Connected Graph
	}
}
