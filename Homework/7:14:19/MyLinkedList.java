 class Node {
  private Node next;
  private Node prev;
  private int Data;
  public Node next(){
    return next;
  }
  public Node prev(){
    return prev;
  }
  public void setNext(Node other){
    next = other;
  }
  public void setPrev(Node other){
    prev = other;
  }
  public Integer getData(){
    return Data;
  }
  public Integer setData(Integer i){
    Data = i;
    return Data;
  }
  public String toString(){
    return Integer.toString(Data);
  }
}

  public class MyLinkedList{
    private Node start;
    private Node end;
    private int length;
    MyLinkedList linkedlist = new MyLinkedList();
    public boolean add(Integer value){
      length ++;
      Node n = new Node();
      n.setData(value);
      if (length == 1){
        end = n;
        return true;
      }
      end.setNext(n);
      n.setPrev(end);
      end = n;
      return true;
    }

    public int size(){
      return length;
    }
    public String toString(){
      Node s = start;
      String out = "";
      while(s != null){
        out = out + s.toString() + ",";
        s = s.next();
      }
      return out;
    }
    public Integer get(int index){
      Node s = start;
      if (index < 0){
        return null;
      }
      for (int i = 0; i < index - 1; i++){
        s = s.next();
      }
      return s.getData();
    }
    public Integer set(int index, int value){
      Node s = start;
      if (index < 0){
        return null;
      }
      for(int i = 0; i < index - 1; i ++){
        s = s.next();
      }
      return s.setData(value);
    }
    public boolean contains(int value){
      Node s = start;
      for(int i = 0; i < length - 1; i++){
        s = s.next();
        if (s.getData() == value){
          return true;
        }
      }
      return false;
    }
    public int indexOf(Integer value){
      Node s = start;
      for(int i = 0; i <length; i++){
        return i;
      }
      return -1;
    }
    public void add(int index, int value){
      Node n = new Node();
      length++;
      n.setData(value);
    /*  if(index > length){
        return null;
      } */
      Node s = start;
      for(int i = 0; i <index - 1; i++){
        s = s.next();
      }
      if (s.next() != null){
        n.setPrev(s.next());
        s.next().setNext(n);
      }
    }
    public int remove(int index){
      if (index > length){
        return -1;
      }
      Node s = start;
      for (int i = 0; i < index; i++){
        s = s.next();
      }
      if (length == 1){
        start = null;
        end = null;
      }
      if (s.next() == null){
        s.prev().setNext(null);
        return index;
      }
      if (s.prev() == null){
        s.next().setPrev(null);
        return index;
      }
      s.prev().setNext(s.next());
      s.next().setPrev(s.prev());
      return index;
    }
    public static void main(String[] args){
      MyLinkedList linkedlist = new MyLinkedList();

    }
  }
