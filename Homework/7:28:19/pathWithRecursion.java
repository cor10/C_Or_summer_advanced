import java.util.*;
public class pathWithRecursion{
  public static int minDistance(HashMap graph, int start, int end){
    ArrayList<Integer> path = new ArrayList<>();
    if (path.size() == 0){
      path.add(start);
    }
    if(start == end){
      for(int i = 0 ; i < path.size(); i++){
        return i;
      }
    }
    for (int i = 0; i < graph.size(); i++){
      for (int j = 0; i < path.size(); j++){
        if (graph.containsKey(j)){
          if(graph.get(start).get(i) != path.get(j)){
            return (path.get(j) +  i);
          }else{
            minDistance(graph, i, end);
          }
        }else{
          minDistance(graph, j - 1, end);
        }
      }
    }
  }
  public static void main(String[] args){
    HashMap<Integer, List<Integer>> graph = new HashMap<>();
    List<Integer> n1 = new ArrayList<>();
    n1.add(1);
    n1.add(2);
    List<Integer> n2 = new ArrayList<>();
    n2.add(4);
    n2.add(3);
    n2.add(5);
    List<Integer> n3 = new ArrayList<>();
    n3.add(6);
    graph.put(0, n1);
    graph.put(1, n2);
    graph.put(2, n3);
    minDistance(graph, 0, 6);
  }
}
