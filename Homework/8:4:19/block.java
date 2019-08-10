import java.io.*;
import java.util.*;
public class block{
  public static void main(String[] args) throws IOException{
    BufferedWriter bw = new BufferedWriter(new FileWriter("blocks.out"));
    BufferedReader br = new BufferedReader(new FileReader("blocks.in"));
    int[] blocksNeeded = new int[26];

    int n = Integer.parseInt(br.readLine());
    for(int i = 0; i < n; i++){
      String currentLine = br.readLine();
      String[] words = currentLine.split(" " );
      String firstWord = words[0];
      String secondWord = words[1];
      int[] first = getNumber(firstWord);
      int[] second = getNumber(secondWord);
      for(int j = 0; j < 26; j++){
        if (first[j] > second[j]){
            blocksNeeded[j] += first[j];
        }else{
          blocksNeeded[j] += second[j];
        }
      }
    }
    for(int i = 0; i < 26; i++){
      bw.write(blocksNeeded[i]);
      bw.newLine();
    }
    bw.close();
  }
  public static int[] getNumber(String s){
      int[] blocksNeeded = new int[26];
      for(int i = 0; i < s.length(); i++){
          int index = s.charAt(i) - 'a';
          blocksNeeded[index]++;
      }
      return blocksNeeded;
  }
}
