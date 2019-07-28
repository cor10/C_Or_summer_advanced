import java.util.HashMap;
import java.util.*;

public class classwork{
  static HashMap<Integer, Integer> map = new HashMap<>();
  private int length;
  public static void main(String[] args){
    /*ArrayList<Integer> n1 = new ArrayList<Integer>(Arrays.asList(1));
    ArrayList<Integer> n2 = new ArrayList<Integer>(Arrays.asList(2, 3));
    ArrayList<integer> n3 = new ArrayList<Integer>(Arrays.asList(4));
    ArrayList<Integer> n4 = new ArrayList<Integer>(Arrays.asList(5));
*/
    map.put(0, 1);
    map.put(1, 2);
    map.put(2, 3);
    map.put(3, 4);
    System.out.println("Distance:" + minDistance(0, 4));
  }
  public static int minDistance(Integer start, Integer end){
    int distance = 0;

    Queue u = new Queue();
    Queue r = new Queue();
    u.enqueue(start);
    while (u.size() > 0){
      if (u.peek() != end){
        r.enqueue(map.get(u.peek()));
        u.dequeue();
      }else{
        return distance;
      }
      u = r;
      r = new Queue();
      distance++;
    }
    for (int i = 0; i< u.size(); i++){
      distance+= i;
    }
    return distance;

  }

}

class Queue{
  private ArrayList<Integer> Q;
  public Queue(){
    Q = new ArrayList<>();
  }
  public void enqueue(Integer x){
    Q.add(x);
  }
  public void dequeue(){
    Q.remove(0);
  }
  public Integer peek(){
    return Q.get(0);
  }
  public Integer size(){
    return Q.size();
  }
}
