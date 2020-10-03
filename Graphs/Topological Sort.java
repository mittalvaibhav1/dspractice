import java.util.*;

class Graph
{
  //Graph Varibales.
  int numberOfVertices;
  LinkedList<Integer> adjacencyList[];
  
  //Constructor To Initalize the Graph.
  public Graph (int v)
  {
    this.numberOfVertices = v;
    this.adjacencyList = new LinkedList[numberOfVertices];
    for(int i = 0 ; i < numberOfVertices ; i++) {
        adjacencyList[i] = new LinkedList<Integer>();
    }
  }
  // Add an Edge to the Graph.
  public void addEdge (int u, int v)
  {
    adjacencyList[u].add(v);
  }
  //Depth First Traversal.
  public void dfs (int i, boolean[]visited, ArrayList<Integer> componentOrder)
  {
      if(visited[i]){
          return;
      }
      visited[i] = true;
      Iterator<Integer> it = adjacencyList[i].iterator();
      while(it.hasNext()) {
          int curr = it.next();
          if(!visited[curr]) {
              dfs(curr,visited,componentOrder);
          }
      }
      componentOrder.add(i);
  }
  //Topological Sort
  public int[] topologicalSort() {
      boolean[] visited = new boolean[numberOfVertices];
      int[] sortedOrder = new int[numberOfVertices];
      int c = numberOfVertices - 1;
      for(int i = 0 ; i < numberOfVertices ; i++) {
          if(!visited[i]) {
              ArrayList<Integer> componentOrder = new ArrayList<>();
              dfs(i,visited,componentOrder);
              for(int j = 0; j < componentOrder.size() ; j++) {
                  sortedOrder[c--] = componentOrder.get(j);
              }
          }
      }
      return sortedOrder;
  }
}

public class Main
{
  public static void main (String[]args)
  {
      Graph graph = new Graph(6);  
        graph.addEdge(5, 2); 
        graph.addEdge(5, 0); 
        graph.addEdge(4, 0); 
        graph.addEdge(4, 1); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 1); 
        
      int[] res = graph.topologicalSort();
      for(int i : res) {
          System.out.print(i + " -> ");
      }
  }
}
