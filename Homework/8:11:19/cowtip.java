import java.util.*;
import java.io.*;
public class cowtip{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("5.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowtip.out")));
        int n = Integer.parseInt(br.readLine());
        int[][] rect = new int[n][n];
        for (int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < n; j++){
                rect[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        int numOfTips = 0;
        for(int i = n -1; i >=0; i--){
            for(int j = n-1; j>=0; j--){
                if (rect[i][j] == 1){
                    numOfTips++;
                    for(int l = 0;l <= j; l++){
                        for(int k = 0; k <= i; k++){
                            if(rect[k][l] == 1){
                                rect[k][l] = 0;
                            }else{
                                rect[k][l] = 1;
                            }
                        }
                    }
                }
            }
        }
        pw.println(numOfTips);
        pw.close();
    }
}
