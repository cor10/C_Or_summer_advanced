import java.io.*;
import java.util.*;
public class pasture{
  public static void main(String[] args) throws IOException{
    BufferedWriter writer = new BufferedWriter(new FileWriter("square.out"));
    int xDistance = 0;
    int yDistance = 0;
    try (BufferedReader br = new BufferedReader(new FileReader("square.in"))){
      for (int i = 0; i < 2; i++){
        String currentLine = br.readLine();
        String[] coor = currentLine.split(" ");
        int xL = Integer.parseInt(coor[0]);
        int yL = Integer.parseInt(coor[1]);
        int xR = Integer.parseInt(coor[2]);
        int yR = Integer.parseInt(coor[3]);
        if (xR - xL > xDistance){
          xDistance = xR - xL;
        }
        if (yR - yL > yDistance){
          yDistance = yR - yL;
        }
      }
    }
    if (yDistance > xDistance){
      writer.write(Integer.toString(yDistance * yDistance));
    }else if(xDistance > yDistance){
      writer.write(Integer.toString(xDistance * xDistance));
    }
    writer.close();

  }
}
