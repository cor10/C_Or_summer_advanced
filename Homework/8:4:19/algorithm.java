import java.util.*;
public class algorithm{
    public Integer setCurrentNode(int[] currentDistances, boolean[] visited){
        int n = 999999999;
        int c = 0;
        for (int i = 0; i<currentDistances.size(); i++){
          if (currentDistances.get(i) < n  && visited.get(i) == false){
            c = i;
            n = currentDistances.get(i);
          }
        }
        return c;
      }
    public static int[] getDistance(Graph graph, int start, int end){
        int[] distance = new int[graph.size()];
        int[] path = new int[graph.size()];
        boolean[] visited = new boolean[graph.size()];
        for (int i = 0; i<distance.length; i++){
            distance.set(i, 99999999);
        }
        distance.set(start, 0);
        for(int i = 0; i< distance.length; i++){
            int n = setCurrentNode(distance, visited);
            visited.set(n, true);

            int[] neighbors = graph.neighbors(n);
            for(int j = 0; j<neighbors.length; j++){
                int vertex = neighbors[j];
                int d = distance[n] + graph.getLength(n, vertex);
                if (distance.get(vertex) > d){
                    distance[vertex] = d;
                    path[vertex] = n;
                }
            }
        }
        return path;
    }
    public static void main(String[] args){
        /*
        currentDistances.put(0, 0);
        currentDistances.put(1, 99999999);
        currentDistances.put(2, 99999999);
        currentDistances.put(3, 99999999);
        currentDistances.put(4, 99999999);
        */
        Graph graph = new Graph(5);
        graph.addEdge(0, 1, 3);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 2, 7);
        graph.addEdge(1, 3, 5);
        graph.addEdge(1, 4, 1);
        graph.addEdge(2, 4, 2);
        graph.addEdge(3, 4, 7);
        getDistance(graph, 0, 5);
    }
}
class Graph{
     static class Edge{
         int source;
         int destination;
         int weight;
         public Edge(int source, int destination, int length){
             this.source = source;
             this.destination = destination;
             this.weight = weight;
         }
     }
     public Graph(int vertices){
         LinkedList neighborslist = new LinkedList[vertices];
         //connect neighbors for all vertices
         for(int i = 0; i < vertices;i++){
             neighborslist[i] = new LinkedList<>();
         }
     }
     public void addEdge(int source, int destination, int length){
         Edge edge = new Edge(source, destination, length);
         neighborslist[source].add(edge);
     }
     public List neighbors(int x){
         return neighborslist[x];
     }

}
