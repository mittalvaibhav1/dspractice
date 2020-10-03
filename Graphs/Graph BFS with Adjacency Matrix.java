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
    public void bfs(int i, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(i);
        while(!q.isEmpty()) {
            int curr = q.poll();
            if(visited[curr] == true){
                continue;
            }
            else {
                System.out.print(curr + " -> ");
                visited[curr] = true;
                for(int j = 0 ; j < numberOfVertices ; j++) {
                    if(visited[j]!=true && adjacencyMatrix[curr][j] == 1) {
                        q.add(j);
                    }
                }
            }
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
        boolean[] visited = new boolean[g.numberOfVertices];
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 2); 
        g.addEdge(3, 3);
        
        for(int i = 0 ; i < g.numberOfVertices ; i++)
        {
            g.bfs(i,visited);//For Disconnected Graph
        }
	}
}
