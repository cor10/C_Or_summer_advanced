import java.util.*;
public class hw{
  public static boolean checkParentheses(String str){
    Stack myStack = new Stack();
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == '('){
        myStack.push(str.charAt(i));
      }else if (str.charAt(i) == ')'){
        if (myStack.isEmpty()){
          return false;
        }
        myStack.pop();
      }
    }
    if (!myStack.isEmpty()){
      return false;
    }
    return true;
  }
  public static void main(String[] args){
    if (checkParentheses("((23((())6(()())(1(()(8((((4)7))-)98653324568))))))")){
      System.out.println("All parentheses are paired");
    }else{
      System.out.println("Error in number of parentheses");
    }
  }
}
