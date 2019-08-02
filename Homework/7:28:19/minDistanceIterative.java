import java.io.*;
import java.util.*;
public class minDistanceIterative{
  Stack stack = new Stack();
  public static String checkDistance(HashMap graph, int start, int end){
    System.out.print("Path is: ");
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(start);
    ArrayList<Integer> path = new ArrayList<>();
    while(stack.size() > 0){
      int point = stack.pop();
      path.add(stack.get(point));
      /*if(visited.contains(point) == false){
        visited.add(point);
        stack.push(graph.get(point))
      }
      */
      for (int i = 0; i < graph.size(); i++){
        for (int j = 0; j < path.size(); j++){
          if (graph.containsKey(j)){
            if((graph.get(point)).get(i) != path.get(j) && (graph.get(point)).get(i) == end){
              return (path.get(j) + " " + i);
            }else {
              stack.push(i);
              path.add(i);
            }
          }else{
            graph.remove(j);
          }
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
    checkDistance(graph, 0, 6);
  }
}
