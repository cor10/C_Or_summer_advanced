import java.io.*;
import java.util.*;
public class cows{
  public static void main(String[] args) throws IOException{
    BufferedWriter bw = new BufferedWriter(new FileWriter("cowsignal.out"));
    BufferedReader br = new BufferedReader(new FileReader("3.in"));
    String currentLine = br.readLine();
    String[] firstLine = currentLine.split(" ");
    int M = Integer.parseInt(firstLine[0]);
    int N = Integer.parseInt(firstLine[1]);
    int K = Integer.parseInt(firstLine[2]);
    for (int i = 0; i < M; i++){
      currentLine = br.readLine();
      for(int l = 0; l < K; l++){

          for(int j = 0; j < currentLine.length(); j++){
            for (int t = 0; t < K; t++){
              bw.write(currentLine.charAt(j));
            }
          }
        bw.newLine();
      }
    }
    bw.close();
  }
}
